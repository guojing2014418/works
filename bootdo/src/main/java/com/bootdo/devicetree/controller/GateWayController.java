package com.bootdo.devicetree.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.DataResult;
import com.bootdo.common.utils.JSONUtils;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.devicetree.domain.GatewayDo;
import com.bootdo.devicetree.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/meta/dmsGateway")
public class GateWayController extends BaseController{
    @Autowired
    GatewayService gatewayService;

    //网关查询
    @RequestMapping(value = "/",method = RequestMethod.GET)
    private @ResponseBody List<GatewayDo> findAll(){
        return gatewayService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private DataResult findOne(@PathVariable("id") Long id){
        GatewayDo gateway = gatewayService.findById(id);
        DataResult dataResult = new DataResult();
        dataResult.setCode(JSONUtils.beanToJson(gateway));
        return dataResult;
    }

    //网关创建
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R add(@RequestBody GatewayDo gatewayDo){
        gatewayDo.setCreator(ShiroUtils.getUserId().toString());
        gatewayDo.setGmtCreate(new Date());
        int count = gatewayService.save(gatewayDo);
        if (count>0){
            return R.ok();
        }
        return R.error("添加失败");
    }
    //网关修改
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R update(@RequestBody GatewayDo gatewayDo){
        int count = gatewayService.update(gatewayDo);
        if (count>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //网关删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R deleteById(@PathVariable("id") Long id){
        int count = gatewayService.delete(id);
        if (count>0){
            return R.ok();
        }
        return R.error("删除失败");
    }


}
