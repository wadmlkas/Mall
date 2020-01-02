package com.wenruiwang.mallbuilding.service;

import com.wenruiwang.mallbuilding.common.api.CommonResult;
import com.wenruiwang.mallbuilding.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

public interface OmsPortalOrderService {

    @Transactional
    CommonResult generatorOrder(OrderParam orderParam);

    @Transactional
    void cancelOrder(Long orderId);
}
