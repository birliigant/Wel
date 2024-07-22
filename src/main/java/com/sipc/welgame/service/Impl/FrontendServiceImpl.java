package com.sipc.welgame.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.sipc.welgame.handler.token.TokenHandler;
import com.sipc.welgame.mapper.UserMapper;
import com.sipc.welgame.pojo.domain.Answer.Frontend;
import com.sipc.welgame.pojo.domain.PrivateKey;
import com.sipc.welgame.pojo.domain.PublicKey;
import com.sipc.welgame.pojo.domain.Page;
import com.sipc.welgame.pojo.domain.UserInfo;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.TokenModel;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.PrivateKeyResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.FrontendService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FrontendServiceImpl implements FrontendService {
    private UserMapper userMapper;
    @Override
    public CommonResult<TotalResult> first(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Frontend.FRONTEND_ANSWER_ONE)){
            return CommonResult.fail();
        }
        if (userInfo.getFrontendLevel() == 1){
            userInfo.setFrontendLevel(userInfo.getFrontendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateFrontendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> second(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Frontend.FRONTEND_ANSWER_TWO)){
            return CommonResult.fail();
        }
        if (userInfo.getFrontendLevel() == 2){
            userInfo.setFrontendLevel(userInfo.getFrontendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateFrontendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> third(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Frontend.FRONTEND_ANSWER_THREE)){
            return CommonResult.fail();
        }
        if (userInfo.getFrontendLevel() == 3){
            userInfo.setFrontendLevel(userInfo.getFrontendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateFrontendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> fourth(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) ||  !request.getAnswer().equals(Frontend.FRONTEND_ANSWER_FOUR)){
            return CommonResult.fail();
        }
        if (userInfo.getFrontendLevel() == 4){
            userInfo.setFrontendLevel(userInfo.getFrontendLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateFrontendLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<PrivateKeyResult> back(PublicKeyRequest request) {
        if (StrUtil.isEmpty(request.getPublicKey()) || !request.getPublicKey().equals(PublicKey.FRONTEND_KEY)){
            return CommonResult.fail();
        }
        PrivateKeyResult result = new PrivateKeyResult();
        result.setPrivateKey(request.getPrivateKey()+PrivateKey.FRONTEND_KEY);
        return CommonResult.success(result);
    }
}
