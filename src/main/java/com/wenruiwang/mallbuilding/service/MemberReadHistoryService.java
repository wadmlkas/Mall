package com.wenruiwang.mallbuilding.service;

import com.wenruiwang.mallbuilding.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

public interface MemberReadHistoryService {

    int create(MemberReadHistory memberReadHistory);

    int delete(List<String> ids);

    List<MemberReadHistory> list(Long memberId);
}
