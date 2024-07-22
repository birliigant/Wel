package com.sipc.welgame.service.Impl;

import cn.hutool.core.util.StrUtil;
import com.sipc.welgame.handler.token.TokenHandler;
import com.sipc.welgame.mapper.UserMapper;
import com.sipc.welgame.pojo.domain.Answer.Main;
import com.sipc.welgame.pojo.domain.UserInfo;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.TokenModel;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {
    private UserMapper userMapper;
    @Override
    public CommonResult<TotalResult> first(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) || !request.getAnswer().equals(Main.MAIN_ANSWER_ONE)) {
            return CommonResult.fail();
        }
        if (userInfo.getMainLevel() == 1){
            userInfo.setMainLevel(userInfo.getMainLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateMainLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<TotalResult> second(AnswerRequest request) {
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        if (StrUtil.isEmpty(request.getAnswer()) || !request.getAnswer().equals(Main.MAIN_ANSWER_TWO)) {
            return CommonResult.fail();
        }
        if (userInfo.getMainLevel() == 2){
            userInfo.setMainLevel(userInfo.getMainLevel()+1);
            userInfo.setTotal(userInfo.getTotal()+1);
            userMapper.updateMainLevelById(userInfo);
        }
        TotalResult result = new TotalResult();
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }
}
