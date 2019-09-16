package com.bootdo.devicetree.service;

import com.bootdo.devicetree.domain.DeviceDo;

import java.util.List;

public interface DeviceService {
    List<DeviceDo> findAll();

    DeviceDo findById(Long id);

    int save(DeviceDo deviceDo);

    int update(DeviceDo deviceDo);

    int delete(Long id);
}
