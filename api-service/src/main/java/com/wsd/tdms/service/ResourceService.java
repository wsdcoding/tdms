package com.wsd.tdms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wsd.tdms.entity.Resource;
import com.wsd.tdms.vo.ResourceVo;

import java.util.List;

/**
 * (Resource)表服务接口
 * 该类由EasyCode工具生成
 * @author ShiDe
 * @since 2020-03-15 22:49:39
 */
public interface ResourceService extends IService<Resource> {

    /**
     * 查询资料
     * @param page 分页对象 
     * @param resourceVo  资料对象
     * @param isPublic  是否查询公开资料
     * @return
     */
    IPage<ResourceVo> getResourceVoList(IPage<ResourceVo> page,ResourceVo resourceVo,boolean isPublic);

    /**
     * 查询某个资料
     * @param id id 
     * @return
     */
    ResourceVo getResourceVoById(Integer id);

    List<Resource> getListByIds(String ids);

    //保存文件
    Resource saveResource(ResourceVo resourceVo);
}