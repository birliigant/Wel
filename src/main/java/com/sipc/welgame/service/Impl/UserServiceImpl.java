package com.sipc.welgame.service.Impl;

import cn.hutool.core.util.ObjectUtil;
import com.sipc.welgame.handler.token.TokenHandler;
import com.sipc.welgame.mapper.UserMapper;
import com.sipc.welgame.pojo.domain.Page;
import com.sipc.welgame.pojo.domain.UserInfo;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.TokenModel;
import com.sipc.welgame.pojo.model.request.LoginRequest;
import com.sipc.welgame.pojo.model.request.SelectRequest;
import com.sipc.welgame.pojo.model.result.TokenResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.service.UserService;
import com.sipc.welgame.utils.JwtUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Override
    public CommonResult<TokenResult> login(LoginRequest request) {
        UserInfo userInfo = userMapper.getByStudentId(request.getStudentId());
        if (ObjectUtil.isNotEmpty(userInfo)){
            if (!userInfo.getName().equals(request.getName())){
                return CommonResult.fail();
            }
        }else {
            userInfo = new UserInfo();
            userInfo.setName(request.getName());
            userInfo.setStudentId(request.getStudentId());
            if(userMapper.insertUser(userInfo) == 0){
                return CommonResult.fail();
            }
        }
        TokenResult result = new TokenResult();
        result.setToken(JwtUtils.sign(userInfo));
        result.setTotalNum(userInfo.getTotal());
        int total = userInfo.getTotal();
        if (total < 2){
            if (total == 1){
                result.setPage(Page.MAIN_PAGE.get(3));
            }else {
                result.setPage(Page.MAIN_PAGE.get(0));
            }
        }else{
            String page = Page.COLLEGE_PAGE;
            result.setPage(page);
        }
        return CommonResult.success(result);
    }

    @Override
    public CommonResult<PageResult> select(SelectRequest request) {
        Map<Integer,String> pageMap = Page.SELECT_PAGE.get(request.getName());
        TokenModel tokenModel = TokenHandler.getTokenModelThreadLocal();
        UserInfo userInfo = userMapper.getByStudentId(tokenModel.getStudentId());
        Map<String,Integer> map = new HashMap<>();
        userInfo.pack(map);
        if (ObjectUtil.isEmpty(pageMap)){
            return CommonResult.fail();
        }
        String page = pageMap.get(map.get(request.getName()));
        PageResult result = new PageResult();
        result.setPage(page);
        result.setTotalNum(userInfo.getTotal());
        return CommonResult.success(result);
    }
}
