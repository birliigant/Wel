package com.sipc.welgame.service;

import com.sipc.welgame.pojo.model.CommonResult;
import com.sipc.welgame.pojo.model.request.AnswerRequest;
import com.sipc.welgame.pojo.model.request.PublicKeyRequest;
import com.sipc.welgame.pojo.model.result.PrivateKeyResult;
import com.sipc.welgame.pojo.model.result.PageResult;
import com.sipc.welgame.pojo.model.result.TotalResult;

public interface FrontendService {
    CommonResult<TotalResult> first(AnswerRequest request);
    CommonResult<TotalResult> second(AnswerRequest request);
    CommonResult<TotalResult> third(AnswerRequest request);
    CommonResult<TotalResult> fourth(AnswerRequest request);
    CommonResult<PrivateKeyResult> back(PublicKeyRequest request);
}
