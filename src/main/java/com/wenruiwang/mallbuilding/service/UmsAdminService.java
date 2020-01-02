package com.wenruiwang.mallbuilding.service;

import java.util.List;
import com.wenruiwang.mallbuilding.mbg.model.UmsAdmin;
import com.wenruiwang.mallbuilding.mbg.model.UmsPermission;

public interface UmsAdminService {
    UmsAdmin getAdminByUsername(String username);

    UmsAdmin register(UmsAdmin umsAdminParam);

    String login(String username, String password);

    List<UmsPermission> getPermissionList(Long adminId);
}
