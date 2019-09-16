package com.bootdo.devicetree.service;

import com.bootdo.devicetree.domain.GatewayModelDo;

import java.util.List;

public interface GatewayModelService {

    List<GatewayModelDo> findAll();

    GatewayModelDo findById(Long id);

    int save(GatewayModelDo gatewayDo);

    int update(GatewayModelDo gatewayDo);

    int delete(Long id);
}
