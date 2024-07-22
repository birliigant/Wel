package com.sipc.welgame.pojo.model.request;

import lombok.Data;

@Data
public class PublicKeyRequest {
    private String publicKey;
    private String privateKey;
}
