package com.court.manipulation.service.base.impl;

import java.util.Map;

import com.court.manipulation.entity.base.RoleMenu;
import com.court.manipulation.mapper.base.RoleMenuMapper;
import com.court.manipulation.service.base.RoleMenuService;
import com.court.jee.base.GenericDao;
import com.court.jee.base.GenericServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class RoleMenuServiceImpl extends GenericServiceImpl<RoleMenu, Integer> implements RoleMenuService {

	 @Resource
    private RoleMenuMapper roleMenuMapper;


    @Override
    public GenericDao<RoleMenu, Integer> getDao() {
        return roleMenuMapper;
    }
	
	/*
	* 找最大ID
	*/
	public Integer findMaxId(){
		return roleMenuMapper.findMaxId();
	}
	
	/*
	* 根据角色Id新增角色菜单
	*/
	public Integer insertRoleMenu(RoleMenu rm){
		int id=findMaxId();
		rm.setId(id+1);
		return roleMenuMapper.insertRoleMenu(rm);
	}
	
	/*
	* 根据角色Id和菜单Id删除角色菜单
	*/
	public void deleteRoleMenuByRIDAndMID(Map<String, Object> param){
		roleMenuMapper.deleteRoleMenuByRIDAndMID(param);
	}
	
	/*
	* 根据角色Id和菜单Id查询角色菜单
	*/
	public RoleMenu selectRoleMenuByRIDAndMID(Map<String, Object> param){
		return roleMenuMapper.selectRoleMenuByRIDAndMID(param);
	}
}
