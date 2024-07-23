package com.sipc.welgame.service;

import com.sipc.welgame.pojo.domain.Answer.Backend;
import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.BlankRequest;
import com.sipc.welgame.pojo.model.request.LoginRequest;
import com.sipc.welgame.pojo.model.request.SelectRequest;
import com.sipc.welgame.pojo.model.result.TokenResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;

public interface UserService {
    CommonResult<TokenResult> login(LoginRequest request);
    CommonResult<PageResult> select(SelectRequest request);
    CommonResult<TotalResult> total();
}
