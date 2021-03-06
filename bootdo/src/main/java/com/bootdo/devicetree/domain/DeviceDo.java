package com.bootdo.devicetree.domain;

import java.io.Serializable;

public class DeviceDo implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.dev
     *
     * @mbg.generated
     */
    private String dev;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.acqInt
     *
     * @mbg.generated
     */
    private Long acqint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.upm
     *
     * @mbg.generated
     */
    private Long upm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.protoType
     *
     * @mbg.generated
     */
    private String prototype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.modelType
     *
     * @mbg.generated
     */
    private String modeltype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.timeOut
     *
     * @mbg.generated
     */
    private Long timeout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.portType
     *
     * @mbg.generated
     */
    private String porttype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.serialID
     *
     * @mbg.generated
     */
    private String serialid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.baudRate
     *
     * @mbg.generated
     */
    private Long baudrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.dataBit
     *
     * @mbg.generated
     */
    private Long databit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.stopBit
     *
     * @mbg.generated
     */
    private Long stopbit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.parity
     *
     * @mbg.generated
     */
    private String parity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.port
     *
     * @mbg.generated
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.devAddr
     *
     * @mbg.generated
     */
    private String devaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.stationd_id
     *
     * @mbg.generated
     */
    private String stationdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.orgstation_id
     *
     * @mbg.generated
     */
    private Long orgstationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dms_device.gateway_id
     *
     * @mbg.generated
     */
    private Long gatewayId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.id
     *
     * @return the value of dms_device.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.id
     *
     * @param id the value for dms_device.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.dev
     *
     * @return the value of dms_device.dev
     *
     * @mbg.generated
     */
    public String getDev() {
        return dev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.dev
     *
     * @param dev the value for dms_device.dev
     *
     * @mbg.generated
     */
    public void setDev(String dev) {
        this.dev = dev == null ? null : dev.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.acqInt
     *
     * @return the value of dms_device.acqInt
     *
     * @mbg.generated
     */
    public Long getAcqint() {
        return acqint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.acqInt
     *
     * @param acqint the value for dms_device.acqInt
     *
     * @mbg.generated
     */
    public void setAcqint(Long acqint) {
        this.acqint = acqint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.upm
     *
     * @return the value of dms_device.upm
     *
     * @mbg.generated
     */
    public Long getUpm() {
        return upm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.upm
     *
     * @param upm the value for dms_device.upm
     *
     * @mbg.generated
     */
    public void setUpm(Long upm) {
        this.upm = upm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.protoType
     *
     * @return the value of dms_device.protoType
     *
     * @mbg.generated
     */
    public String getPrototype() {
        return prototype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.protoType
     *
     * @param prototype the value for dms_device.protoType
     *
     * @mbg.generated
     */
    public void setPrototype(String prototype) {
        this.prototype = prototype == null ? null : prototype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.modelType
     *
     * @return the value of dms_device.modelType
     *
     * @mbg.generated
     */
    public String getModeltype() {
        return modeltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.modelType
     *
     * @param modeltype the value for dms_device.modelType
     *
     * @mbg.generated
     */
    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.timeOut
     *
     * @return the value of dms_device.timeOut
     *
     * @mbg.generated
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.timeOut
     *
     * @param timeout the value for dms_device.timeOut
     *
     * @mbg.generated
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.portType
     *
     * @return the value of dms_device.portType
     *
     * @mbg.generated
     */
    public String getPorttype() {
        return porttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.portType
     *
     * @param porttype the value for dms_device.portType
     *
     * @mbg.generated
     */
    public void setPorttype(String porttype) {
        this.porttype = porttype == null ? null : porttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.serialID
     *
     * @return the value of dms_device.serialID
     *
     * @mbg.generated
     */
    public String getSerialid() {
        return serialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.serialID
     *
     * @param serialid the value for dms_device.serialID
     *
     * @mbg.generated
     */
    public void setSerialid(String serialid) {
        this.serialid = serialid == null ? null : serialid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.baudRate
     *
     * @return the value of dms_device.baudRate
     *
     * @mbg.generated
     */
    public Long getBaudrate() {
        return baudrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.baudRate
     *
     * @param baudrate the value for dms_device.baudRate
     *
     * @mbg.generated
     */
    public void setBaudrate(Long baudrate) {
        this.baudrate = baudrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.dataBit
     *
     * @return the value of dms_device.dataBit
     *
     * @mbg.generated
     */
    public Long getDatabit() {
        return databit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.dataBit
     *
     * @param databit the value for dms_device.dataBit
     *
     * @mbg.generated
     */
    public void setDatabit(Long databit) {
        this.databit = databit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.stopBit
     *
     * @return the value of dms_device.stopBit
     *
     * @mbg.generated
     */
    public Long getStopbit() {
        return stopbit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.stopBit
     *
     * @param stopbit the value for dms_device.stopBit
     *
     * @mbg.generated
     */
    public void setStopbit(Long stopbit) {
        this.stopbit = stopbit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.parity
     *
     * @return the value of dms_device.parity
     *
     * @mbg.generated
     */
    public String getParity() {
        return parity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.parity
     *
     * @param parity the value for dms_device.parity
     *
     * @mbg.generated
     */
    public void setParity(String parity) {
        this.parity = parity == null ? null : parity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.ip
     *
     * @return the value of dms_device.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.ip
     *
     * @param ip the value for dms_device.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.port
     *
     * @return the value of dms_device.port
     *
     * @mbg.generated
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.port
     *
     * @param port the value for dms_device.port
     *
     * @mbg.generated
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.devAddr
     *
     * @return the value of dms_device.devAddr
     *
     * @mbg.generated
     */
    public String getDevaddr() {
        return devaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.devAddr
     *
     * @param devaddr the value for dms_device.devAddr
     *
     * @mbg.generated
     */
    public void setDevaddr(String devaddr) {
        this.devaddr = devaddr == null ? null : devaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.stationd_id
     *
     * @return the value of dms_device.stationd_id
     *
     * @mbg.generated
     */
    public String getStationdId() {
        return stationdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.stationd_id
     *
     * @param stationdId the value for dms_device.stationd_id
     *
     * @mbg.generated
     */
    public void setStationdId(String stationdId) {
        this.stationdId = stationdId == null ? null : stationdId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.orgstation_id
     *
     * @return the value of dms_device.orgstation_id
     *
     * @mbg.generated
     */
    public Long getOrgstationId() {
        return orgstationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.orgstation_id
     *
     * @param orgstationId the value for dms_device.orgstation_id
     *
     * @mbg.generated
     */
    public void setOrgstationId(Long orgstationId) {
        this.orgstationId = orgstationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dms_device.gateway_id
     *
     * @return the value of dms_device.gateway_id
     *
     * @mbg.generated
     */
    public Long getGatewayId() {
        return gatewayId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dms_device.gateway_id
     *
     * @param gatewayId the value for dms_device.gateway_id
     *
     * @mbg.generated
     */
    public void setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
    }
}