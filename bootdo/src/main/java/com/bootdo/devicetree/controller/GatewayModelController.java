package com.bootdo.devicetree.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.DataResult;
import com.bootdo.common.utils.JSONUtils;
import com.bootdo.common.utils.R;
import com.bootdo.devicetree.domain.GatewayModelDo;
import com.bootdo.devicetree.service.GatewayModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/meta/dmsGateWaytype")
public class GatewayModelController extends BaseController{

    @Autowired
    GatewayModelService gatewayModelService;

    //网关类型查询
    @RequestMapping(value = "/",method = RequestMethod.GET)
    private List<GatewayModelDo> findAll(){
        return gatewayModelService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private DataResult findById(@PathVariable("id") Long id){
        GatewayModelDo gatewayModelDo = gatewayModelService.findById(id);
        DataResult dataResult = new DataResult();
        dataResult.setCode(JSONUtils.beanToJson(gatewayModelDo));
        return dataResult;
    }

    //网关类型添加
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R add(@RequestBody GatewayModelDo gatewayModelDo){
        gatewayModelDo.setGmtCreate(new Date());
        int count = gatewayModelService.save(gatewayModelDo);
        if (count>0){
            return R.ok();
        }
        return R.error("添加失败");
    }

    //网关类型修改
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R update(@RequestBody GatewayModelDo gatewayModelDo){
        int count = gatewayModelService.update(gatewayModelDo);
        if (count>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //网关类型删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R deleteById(@PathVariable("id") Long id){
        int count = gatewayModelService.delete(id);
        if (count>0){
            return R.ok();
        }
        return R.error("删除失败");
    }

}
