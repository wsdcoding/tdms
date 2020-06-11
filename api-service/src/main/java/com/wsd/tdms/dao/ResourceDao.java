package com.wsd.tdms.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wsd.tdms.entity.Resource;
import com.wsd.tdms.vo.ResourceVo;
import org.apache.ibatis.annotations.*;

/**
 * (Resource)表数据库访问层
 * 该类由EasyCode工具生成
 * @author ShiDe
 * @since 2020-03-15 22:49:39
 */
public interface ResourceDao extends BaseMapper<Resource> {


    /**
     * 查询资料模型，注意不能带有where条件，where条件需要从外部传
     * @param page
     * @param queryWrapper
     * @return
     */
    /*@Select("SELECT\n" +
            "   a.create_time, a.des,a.file_suffix,a.id,a.path_resource_name,a.resource_name,a.resource_size,a.resource_state,\n" +
            "   a.type_id, b.resource_type_name,\n" +
            "\n" +
            "   c.id AS organization_id,\n" +
            "   c. NAME AS organization_name,\n" +
            "   d.user_show as up_user\n" +
            "FROM\n" +
            "   resource a,\n" +
            "   resource_type b,\n" +
            "   organization c,\n" +
            "   sys_user_table d\n" +
            "${ew.customSqlSegment} ")*/

    @Select("select \n"+
            "    a.*,\n"+
            "    b.resource_type_name,\n"+
            "    c.id as  organization_id,\n"+
            "    c.name as  organization_name\n"+
            " from resource  a ,resource_type b , organization c\n"+
            " ${ew.customSqlSegment} ")

    IPage<ResourceVo> getResourceVoList(
            @Param(Constants.WRAPPER) IPage<ResourceVo> page,
            @Param(Constants.WRAPPER) Wrapper<ResourceVo> queryWrapper);

}