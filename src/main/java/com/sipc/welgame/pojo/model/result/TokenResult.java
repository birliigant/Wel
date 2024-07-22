package com.sipc.welgame.pojo.model.result;

import lombok.Data;

@Data
public class TokenResult {
    private String token;
    private String page;
    private Integer totalNum;
}
