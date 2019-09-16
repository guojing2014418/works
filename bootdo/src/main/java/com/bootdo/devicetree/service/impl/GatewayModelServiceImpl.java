package com.bootdo.devicetree.service.impl;

import com.bootdo.devicetree.dao.GatewayDao;
import com.bootdo.devicetree.dao.GatewayModelDao;
import com.bootdo.devicetree.domain.GatewayModelDo;
import com.bootdo.devicetree.domain.GatewayModelDoExample;
import com.bootdo.devicetree.service.GatewayModelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GatewayModelServiceImpl implements GatewayModelService {

    @Autowired
    private GatewayModelDao gatewayModelDao;
    @Override
    public List<GatewayModelDo> findAll() {
        return gatewayModelDao.selectByExample(new GatewayModelDoExample());
    }

    @Override
    public GatewayModelDo findById(Long id) {
        return gatewayModelDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(GatewayModelDo deviceDo) {
        return   gatewayModelDao.insert(deviceDo);
    }

    @Override
    public int update(GatewayModelDo deviceDo) {
        return gatewayModelDao.updateByPrimaryKeySelective(deviceDo);
    }

    @Override
    public int delete(Long id) {
        return gatewayModelDao.deleteByPrimaryKey(id);
    }
}
