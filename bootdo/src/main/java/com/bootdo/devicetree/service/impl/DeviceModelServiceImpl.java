package com.bootdo.devicetree.service.impl;

import com.bootdo.devicetree.dao.DeviceModelDao;
import com.bootdo.devicetree.domain.DeviceModelDo;
import com.bootdo.devicetree.domain.DeviceModelDoExample;
import com.bootdo.devicetree.service.DeviceModelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeviceModelServiceImpl implements DeviceModelService {

    @Autowired
    private DeviceModelDao deviceModelDao;
    @Override
    public List<DeviceModelDo> findAll() {
        return deviceModelDao.selectByExample(new DeviceModelDoExample());
    }

    @Override
    public DeviceModelDo findById(Long id) {
        return deviceModelDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(DeviceModelDo deviceModelDo) {
        return deviceModelDao.insert(deviceModelDo);
    }

    @Override
    public int update(DeviceModelDo deviceModelDo) {
        return deviceModelDao.updateByPrimaryKeySelective(deviceModelDo);
    }

    @Override
    public int delete(Long id) {
        return deviceModelDao.deleteByPrimaryKey(id);
    }
}
