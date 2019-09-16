package com.bootdo.devicetree.dao;

import com.bootdo.devicetree.domain.DeviceModelDo;
import com.bootdo.devicetree.domain.DeviceModelDoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceModelDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    int insert(DeviceModelDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    int insertSelective(DeviceModelDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    List<DeviceModelDo> selectByExample(DeviceModelDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    DeviceModelDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DeviceModelDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_device_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DeviceModelDo record);
}