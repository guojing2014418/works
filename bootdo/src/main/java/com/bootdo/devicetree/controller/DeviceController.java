package com.bootdo.devicetree.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.DataResult;
import com.bootdo.common.utils.JSONUtils;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.devicetree.domain.DeviceDo;
import com.bootdo.devicetree.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("meta/dmsDevice")
public class DeviceController extends BaseController{

    @Autowired
    private DeviceService deviceService;

    //设备查询
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List list(){
       return deviceService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DataResult findById(@PathVariable("id")int id){
        DeviceDo device = deviceService.findById(Long.valueOf(id));
        DataResult dataResult = new DataResult();
        dataResult.setDate(JSONUtils.beanToJson(device));
        return dataResult;
    }

    //设备添加
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R add(DeviceDo deviceDo){
        int count = deviceService.save(deviceDo);
        if (count>0){
            return R.ok();
        }
        return R.error("添加失败");
    }

    //设备修改
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R update(DeviceDo deviceDo){
        int count = deviceService.update(deviceDo);
        if (count>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //设备删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R delete(@PathVariable("id")Long id){
        int count = deviceService.delete(id);
        if (count>0){
            return R.ok();
        }
        return R.error("删除失败");
    }


}
