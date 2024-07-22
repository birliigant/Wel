package com.sipc.welgame.service;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.LoginRequest;
import com.sipc.welgame.pojo.model.request.SelectRequest;
import com.sipc.welgame.pojo.model.result.TokenResult;
import com.sipc.welgame.pojo.model.result.PageResult;

public interface UserService {
    CommonResult<TokenResult> login(LoginRequest request);
    CommonResult<PageResult> select(SelectRequest request);
}
