package com.wsd.tdms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsd.tdms.entity.SysRoleBackendApiTable;
import com.wsd.tdms.vo.SysRoleAndPermissionVo;

/**
 * (SysRoleBackendApiTable)表服务接口
 * 该类由EasyCode工具生成
 * @author ShiDe
 * @since 2020-03-09 12:11:56
 */
public interface SysRoleBackendApiTableService extends IService<SysRoleBackendApiTable> {

    /**
     * 批量保存角色-API表
     * 该方法内有两个操作，先删除、后批量新增，因此存在事务控制
     * @param roleId
     * @param sysRoleAndPermissionVos
     * @return
     */
    boolean saveRoleAip(String roleId, SysRoleAndPermissionVo... sysRoleAndPermissionVos);
}