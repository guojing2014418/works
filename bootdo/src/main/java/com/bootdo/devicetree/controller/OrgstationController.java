package com.bootdo.devicetree.controller;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.utils.DataResult;
import com.bootdo.common.utils.JSONUtils;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.devicetree.domain.OrgstationDo;
import com.bootdo.devicetree.service.OrgstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/meta/dmsOrgStaion")
public class OrgstationController extends BaseController{

    @Autowired
    private OrgstationService orgstationService;

    //机构组织站点查询
    @RequestMapping(value = "/",method = RequestMethod.GET)
    private List<OrgstationDo> findAll()
    {
        Long userId = ShiroUtils.getUserId();
        return orgstationService.findAll(userId);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private DataResult findById(@PathVariable("id") Long id){
        OrgstationDo orgstationDo = orgstationService.findById(id);
        DataResult dataResult = new DataResult();
        dataResult.setCode(JSONUtils.beanToJson(orgstationDo));
        return dataResult;
    }

    //机构组织站点创建
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R add(@RequestBody OrgstationDo orgstation){
        orgstation.setCreator(ShiroUtils.getUserId().toString());
        orgstation.setGmtCreate(new Date());
        int count = orgstationService.save(orgstation);
        if (count>0){
            return R.ok();
        }
        return R.error("添加失败");
    }

    //机构组织站点修改
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R update(@RequestBody OrgstationDo orgstationDo){
        int count = orgstationService.update(orgstationDo);
        if (count>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //机构组织站点删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R deleteById(@PathVariable("id") Long id){
        int count = orgstationService.delete(id);
        if (count>0){
            return R.ok();
        }
        return R.error("删除失败");
    }

}
