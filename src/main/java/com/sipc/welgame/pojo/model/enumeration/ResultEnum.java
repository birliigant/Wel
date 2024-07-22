package com.sipc.welgame.pojo.model.enumeration;

import lombok.Getter;

@Getter
public enum ResultEnum {
    SUCCESS("200", "请求成功"),
    FAILED("400", "请求失败");
    private final String code;
    private final String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}