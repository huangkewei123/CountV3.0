package com.court.manipulation.service.base.impl;

import java.util.List;

import com.court.manipulation.entity.base.Permission;
import com.court.manipulation.mapper.base.PermissionMapper;
import com.court.manipulation.service.base.PermissionService;
import com.court.jee.base.GenericDao;
import com.court.jee.base.GenericServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 权限Service实现类
 *
 * @author hkw
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> findPermissionsByRoleId(Integer roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
