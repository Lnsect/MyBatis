package com.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybatis.params.RoleParam;
import com.mybatis.po.Role;

public interface RoleMapper {
	Role getRoleBySqlElement(Long id);
	
	Role getRole(Long id);
	int deleteRole(Long id);
	int insertRole(Role role);
	int insertRoleByAutoPrimaryKey(Role role);
	List<Role> findRole(String roleName);
	
	// chapter4: ����2��ʹ��ע�ⷽʽ����
	public List<Role> findRoleByAnnotation(
			@Param("roleName")String roleName, @Param("note")String note);
	
	// ����3��ʹ��java bean ���ݲ���
	public List<Role> findRoleByParam(RoleParam roleParam);
	
	// mybatis ����SQL ����
	public List<String> findColumn(
			@Param("column") String column, @Param("table") String table);
}
