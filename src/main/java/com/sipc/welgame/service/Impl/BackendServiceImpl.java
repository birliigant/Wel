package com.sipc.welgame.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.sipc.welgame.handler.token.TokenHandler;
import com.sipc.welgame.mapper.UserMapper;
import com.sipc.welgame.pojo.domain.Answer.Backend;
import com.sipc.welgame.pojo.domain.Answer.Game;
import com.sipc.welgame.pojo.domain.Page;
import com.sipc.welgame.pojo.domain.UserInfo;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.TokenModel;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.BackendService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BackendServiceImpl implements BackendService {
    private UserMapper userMapper;
    @Override
    public CommonResult<TotalResult> first(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Backend.BACKEND_ANSWER_ONE)){
            return CommonResult.fail();
        }
        if (userInfo.getBackendLevel() == 1){
            userInfo.setBackendLevel(userInfo.getBackendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateBackendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> second(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer())){
            return CommonResult.fail();
        }
        if (!Backend.verifyQuestionOne(request.getAnswer())){
            return CommonResult.fail();
        }
        if (userInfo.getBackendLevel() == 2){
            userInfo.setBackendLevel(userInfo.getBackendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateBackendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> third(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Backend.BACKEND_ANSWER_THREE)){
            return CommonResult.fail();
        }
        if (userInfo.getBackendLevel() == 3){
            userInfo.setBackendLevel(userInfo.getBackendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateBackendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> fourth(PublicKeyRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getPrivateKey()) ||  !request.getPrivateKey().equals(Backend.BACKEND_ANSWER_FOUR)){
            return CommonResult.fail();
        }
        if (userInfo.getBackendLevel() == 4){
            userInfo.setBackendLevel(userInfo.getBackendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateBackendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }
}
