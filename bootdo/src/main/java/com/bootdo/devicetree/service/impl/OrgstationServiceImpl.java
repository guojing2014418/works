package com.bootdo.devicetree.service.impl;

import com.bootdo.devicetree.dao.OrgstationDao;
import com.bootdo.devicetree.domain.OrgstationDo;
import com.bootdo.devicetree.domain.OrgstationDoExample;
import com.bootdo.devicetree.service.OrgstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrgstationServiceImpl implements OrgstationService {
    @Autowired
    private OrgstationDao orgstationDao;

    //查询机构
    @Override
    public List findAll(Long userId) {
        return orgstationDao.selectByExample(new OrgstationDoExample());
    }

    @Override
    public OrgstationDo findById(Long id) {
        return orgstationDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(OrgstationDo orgstationDo) {
        return orgstationDao.insert(orgstationDo);
    }

    @Override
    public int update(OrgstationDo orgstationDo) {
        return orgstationDao.updateByPrimaryKeySelective(orgstationDo);
    }

    @Override
    public int delete(Long id) {
        return orgstationDao.deleteByPrimaryKey(id);
    }
}
