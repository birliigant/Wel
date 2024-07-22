package com.sipc.welgame.service;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;

public interface MainService {
    CommonResult<TotalResult> first(AnswerRequest request);
    CommonResult<TotalResult> second(AnswerRequest request);
}