package com.wsd.tdms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsd.tdms.dao.OrganizationDao;
import com.wsd.tdms.entity.Organization;
import com.wsd.tdms.service.OrganizationService;
import org.springframework.stereotype.Service;

/**
 * (Organization)表服务实现类
 *
 * @author 
 * @since 2020-04-21 19:30:48
 */
@Service("organizationService")
public class OrganizationServiceImpl extends ServiceImpl<OrganizationDao, Organization> implements OrganizationService {

}