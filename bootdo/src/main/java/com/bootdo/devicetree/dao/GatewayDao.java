package com.bootdo.devicetree.dao;

import com.bootdo.devicetree.domain.GatewayDo;
import com.bootdo.devicetree.domain.GatewayDoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GatewayDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    int insert(GatewayDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    int insertSelective(GatewayDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    List<GatewayDo> selectByExample(GatewayDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    GatewayDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GatewayDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dms_gateway
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GatewayDo record);
}