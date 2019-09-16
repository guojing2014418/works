package com.bootdo.devicetree.service.impl;

import com.bootdo.devicetree.dao.GatewayDao;
import com.bootdo.devicetree.domain.GatewayDo;
import com.bootdo.devicetree.domain.GatewayDoExample;
import com.bootdo.devicetree.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class GatewayServiceImpl implements GatewayService {

    @Autowired
    private GatewayDao gatewayDao;
    @Override
    public List<GatewayDo> findAll() {
        return gatewayDao.selectByExample(new GatewayDoExample());
    }

    @Override
    public GatewayDo findById(Long id) {
        return gatewayDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(GatewayDo gatewayDo) {
        return gatewayDao.insert(gatewayDo);
    }

    @Override
    public int update(GatewayDo gatewayDo) {
        return gatewayDao.updateByPrimaryKeySelective(gatewayDo);
    }

    @Override
    public int delete(Long id) {
        return gatewayDao.deleteByPrimaryKey(id);
    }

}
