package com.wenruiwang.mallbuilding.service;

import com.wenruiwang.mallbuilding.common.api.CommonResult;

public interface UmsMemberService {

    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
