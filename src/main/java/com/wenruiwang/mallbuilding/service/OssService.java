package com.wenruiwang.mallbuilding.service;

import com.wenruiwang.mallbuilding.dto.OssCallbackResult;
import com.wenruiwang.mallbuilding.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

public interface OssService {

    OssPolicyResult policy();

    OssCallbackResult callback(HttpServletRequest request);
}
