package com.wenruiwang.mallbuilding.service.impl;

import com.wenruiwang.mallbuilding.common.api.CommonResult;
import com.wenruiwang.mallbuilding.component.CancelOrderSender;
import com.wenruiwang.mallbuilding.dto.OrderParam;
import com.wenruiwang.mallbuilding.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);
    @Autowired
    private CancelOrderSender cancelOrderSender;

    @Override
    public CommonResult generatorOrder(OrderParam orderParam) {
        LOGGER.info("process generatorOrder");
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null, "successfully order");
    }

    @Override
    public void cancelOrder(Long orderId) {
        LOGGER.info("process cancelOrder orderId:{}", orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        long delayTimes = 30 * 1000;
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }
}

