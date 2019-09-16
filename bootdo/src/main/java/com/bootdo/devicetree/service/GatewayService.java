package com.bootdo.devicetree.service;

import com.bootdo.devicetree.domain.GatewayDo;

import java.util.List;

public interface GatewayService {
    List<GatewayDo> findAll();

    GatewayDo findById(Long id);

    int save(GatewayDo gatewayDo);

    int update(GatewayDo gatewayDo);

    int delete(Long id);

    //根据机构id删除网关
    //List<GatewayDo> findByMechanismId(Long id);
}
