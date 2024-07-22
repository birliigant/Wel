package com.sipc.welgame.controller;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.BackendService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sipc/backend")
@AllArgsConstructor
public class BackendController {
    private BackendService backendService;
    @PostMapping("/first")
    CommonResult<TotalResult> first(@RequestBody AnswerRequest request){
        return backendService.first(request);
    }
    @PostMapping("/second")
    CommonResult<TotalResult> second(@RequestBody AnswerRequest request){
        return backendService.second(request);
    }
    @PostMapping("/third")
    CommonResult<TotalResult> third(@RequestBody AnswerRequest request){
        return backendService.third(request);
    }
    @PostMapping("/fourth")
    CommonResult<TotalResult> fourth(@RequestBody PublicKeyRequest request){
        return backendService.fourth(request);
    }
}