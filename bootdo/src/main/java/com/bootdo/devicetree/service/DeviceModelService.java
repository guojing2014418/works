package com.bootdo.devicetree.service;

import com.bootdo.devicetree.domain.DeviceModelDo;

import java.util.List;

public interface DeviceModelService {

    List<DeviceModelDo> findAll();

    DeviceModelDo findById(Long id);

    int save(DeviceModelDo deviceModelDo);

    int update(DeviceModelDo deviceModelDo);

    int delete(Long id);
}
