package com.bootdo.devicetree.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.DataResult;
import com.bootdo.common.utils.JSONUtils;
import com.bootdo.common.utils.R;
import com.bootdo.devicetree.domain.DeviceModelDo;
import com.bootdo.devicetree.service.DeviceModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/meta/dmsDeviceType")
public class DeviceModelController extends BaseController {

    @Autowired
    private DeviceModelService deviceModelService;

   //设备类型查询
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private DataResult findById(@PathVariable(value = "id") int id){
        DeviceModelDo deviceModelDo = deviceModelService.findById(Long.valueOf(id));
        DataResult dataResult = new DataResult();
        dataResult.setDate(JSONUtils.beanToJson(deviceModelDo));
        return dataResult;
    }

    //设备类型创建
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R add(@RequestBody DeviceModelDo deviceModelDo){
        deviceModelDo.setGmtCreate(new Date());
        int count = deviceModelService.save(deviceModelDo);
        if (count>0){
            return R.ok();
        }
        return R.error("添加失败");
    }

    //设备类型修改
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R update(@RequestBody DeviceModelDo deviceModelDo){
        int count = deviceModelService.update(deviceModelDo);
        if (count>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //设备类型删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R deleteById(@PathVariable("id") Long id){
        int count = deviceModelService.delete(id);
        if (count>0){
            return R.ok();
        }
        return R.error("删除失败");
    }
}
