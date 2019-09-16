package com.bootdo.devicetree.service;

import com.bootdo.devicetree.domain.OrgstationDo;

import java.util.List;

public interface OrgstationService {

    List findAll(Long userId);

    OrgstationDo findById(Long id);

    int save(OrgstationDo orgstationDo);

    int update(OrgstationDo orgstationDo);

    int delete(Long id);

}
