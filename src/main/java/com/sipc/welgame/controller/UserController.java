package com.sipc.welgame.controller;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.BlankRequest;
import com.sipc.welgame.pojo.model.request.LoginRequest;
import com.sipc.welgame.pojo.model.request.SelectRequest;
import com.sipc.welgame.pojo.model.result.TokenResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sipc/user")
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @PostMapping("/login")
    public CommonResult<TokenResult> login(@RequestBody LoginRequest request){
        return userService.login(request);
    }
    @PostMapping("/college")
    CommonResult<PageResult> select(@RequestBody SelectRequest request){
        return userService.select(request);
    }
    @PostMapping("/total")
    CommonResult<TotalResult> total(BlankRequest request){
        return userService.total();
    }
}
