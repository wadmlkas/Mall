package com.wenruiwang.mallbuilding.dto;

import io.swagger.annotations.ApiModelProperty;

public class OssPolicyResult {
    @ApiModelProperty("user identity used in authentication")
    private String accessKeyId;
    @ApiModelProperty("upload policy, with base64 encoding")
    private String policy;
    @ApiModelProperty("string after policy signature")
    private String signature;
    @ApiModelProperty("prefix of upload dir path")
    private String dir;
    @ApiModelProperty("internet domain of oss")
    private String host;
    @ApiModelProperty("callback setting")
    private String callback;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
