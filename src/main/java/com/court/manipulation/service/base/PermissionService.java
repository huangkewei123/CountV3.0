package com.court.manipulation.service.base;

import java.util.List;

import com.court.manipulation.entity.base.Permission;
import com.court.jee.base.GenericService;

/**
 * 权限 业务接口
 * 
 * @author hkw
 * @since 2014年6月10日 下午12:02:39
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> findPermissionsByRoleId(Integer roleId);

}
