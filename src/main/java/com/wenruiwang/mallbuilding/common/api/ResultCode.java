package com.wenruiwang.mallbuilding.common.api;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "successful operation"),
    FAILED(500, "unsuccessful operation"),
    VALIDATE_FAILED(404, "parameter validation failed"),
    UNAUTHORIZED(401, "not log in or token expires"),
    FORBIDDEN(403, "no related permissions");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
