package com.wenruiwang.mallbuilding.dto;

import io.swagger.annotations.ApiModelProperty;

public class OssCallbackParam {
    @ApiModelProperty("request callback address")
    private String callbackUrl;
    @ApiModelProperty("request callback param")
    private String callbackBody;
    @ApiModelProperty("when callback, request param type")
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}
