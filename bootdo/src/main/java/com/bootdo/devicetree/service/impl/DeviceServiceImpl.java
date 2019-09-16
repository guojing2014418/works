package com.bootdo.devicetree.service.impl;

import com.bootdo.devicetree.dao.DeviceDao;

import com.bootdo.devicetree.domain.DeviceDo;
import com.bootdo.devicetree.domain.DeviceDoExample;
import com.bootdo.devicetree.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceDao deviceDao;

    @Override
    public List<DeviceDo> findAll() {
        return deviceDao.selectByExample(new DeviceDoExample());
    }

    @Override
    public DeviceDo findById(Long id) {
        return deviceDao.selectByPrimaryKey(id);
    }

    @Override
    public int save(DeviceDo deviceDo) {
      return   deviceDao.insert(deviceDo);
    }

    @Override
    public int update(DeviceDo deviceDo) {
        return deviceDao.updateByPrimaryKeySelective(deviceDo);
    }

    @Override
    public int delete(Long id) {
        return deviceDao.deleteByPrimaryKey(id);
    }
}
