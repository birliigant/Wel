package com.sipc.welgame.controller;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.PrivateKeyResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;
import com.sipc.welgame.service.FrontendService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sipc/frontend")
@AllArgsConstructor
public class FrontendController {
    private FrontendService frontendService;
    @PostMapping("/first")
    CommonResult<TotalResult> first(@RequestBody AnswerRequest request){
        return frontendService.first(request);
    }
    @PostMapping("/second")
    CommonResult<TotalResult> second(@RequestBody AnswerRequest request){
        return frontendService.second(request);
    }
    @PostMapping("/third")
    CommonResult<TotalResult> third(@RequestBody AnswerRequest request){
        return frontendService.third(request);
    }
    @PostMapping("/fourth")
    CommonResult<TotalResult> fourth(@RequestBody AnswerRequest request){
        return frontendService.fourth(request);
    }
    @PostMapping("/back")
    CommonResult<PrivateKeyResult> back(@RequestBody PublicKeyRequest request){
        return frontendService.back(request);
    }
}
