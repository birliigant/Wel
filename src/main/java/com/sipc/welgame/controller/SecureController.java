package com.sipc.welgame.controller;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.PrivateKeyResult;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sipc/secure")
@AllArgsConstructor
public class SecureController {
    private SecurityService securityService;
    @PostMapping("/first")
    CommonResult<TotalResult> first(@RequestBody AnswerRequest request){
        return securityService.first(request);
    }
    @PostMapping("/second")
    CommonResult<TotalResult> second(@RequestBody AnswerRequest request){
        return securityService.second(request);
    }
    @PostMapping("/third")
    CommonResult<TotalResult> third(@RequestBody AnswerRequest request){
        return securityService.third(request);
    }
    @PostMapping("/fourth")
    CommonResult<TotalResult> fourth(@RequestBody AnswerRequest request){
        return securityService.fourth(request);
    }
    @PostMapping("/fifth")
    CommonResult<TotalResult> fifth(@RequestBody AnswerRequest request){
        return securityService.fifth(request);
    }
    @PostMapping("/back")
    CommonResult<PrivateKeyResult> back(@RequestBody PublicKeyRequest request){
        return securityService.back(request);
    }
}
