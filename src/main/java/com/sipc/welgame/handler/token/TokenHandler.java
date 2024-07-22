package com.sipc.welgame.handler.token;


import com.sipc.welgame.pojo.model.TokenModel;

public class TokenHandler {
    private static final ThreadLocal<TokenModel> tokenModelThreadLocal = new ThreadLocal<>();

    public static TokenModel getTokenModelThreadLocal() {
        return tokenModelThreadLocal.get();
    }

    public static void setTokenModelThreadLocal(TokenModel payload) {
        tokenModelThreadLocal.set(payload);
    }

    public static void remove() {
        tokenModelThreadLocal.remove();
    }
}