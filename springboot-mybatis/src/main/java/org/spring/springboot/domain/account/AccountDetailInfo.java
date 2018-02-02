package org.spring.springboot.domain.account;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetailInfo {
    /***/
    private Long id;

    /**交通费*/
    private BigDecimal trafficAmount;

    /**家居费用*/
    private BigDecimal houseAccount;

    /**医疗费用*/
    private BigDecimal medicalAmount;

    /**通信费*/
    private BigDecimal messageAccount;

    /**其他费用*/
    private BigDecimal otherAccount;

    /***/
    private String openId;

    /**更新时间*/
    private Date updateTime;

    /**创建时间*/
    private Date createTime;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 交通费
     * @return traffic_amount 交通费
     */
    public BigDecimal getTrafficAmount() {
        return trafficAmount;
    }

    /**
     * 交通费
     * @param trafficAmount 交通费
     */
    public void setTrafficAmount(BigDecimal trafficAmount) {
        this.trafficAmount = trafficAmount;
    }

    /**
     * 家居费用
     * @return house_account 家居费用
     */
    public BigDecimal getHouseAccount() {
        return houseAccount;
    }

    /**
     * 家居费用
     * @param houseAccount 家居费用
     */
    public void setHouseAccount(BigDecimal houseAccount) {
        this.houseAccount = houseAccount;
    }

    /**
     * 医疗费用
     * @return medical_amount 医疗费用
     */
    public BigDecimal getMedicalAmount() {
        return medicalAmount;
    }

    /**
     * 医疗费用
     * @param medicalAmount 医疗费用
     */
    public void setMedicalAmount(BigDecimal medicalAmount) {
        this.medicalAmount = medicalAmount;
    }

    /**
     * 通信费
     * @return message_account 通信费
     */
    public BigDecimal getMessageAccount() {
        return messageAccount;
    }

    /**
     * 通信费
     * @param messageAccount 通信费
     */
    public void setMessageAccount(BigDecimal messageAccount) {
        this.messageAccount = messageAccount;
    }

    /**
     * 其他费用
     * @return other_account 其他费用
     */
    public BigDecimal getOtherAccount() {
        return otherAccount;
    }

    /**
     * 其他费用
     * @param otherAccount 其他费用
     */
    public void setOtherAccount(BigDecimal otherAccount) {
        this.otherAccount = otherAccount;
    }

    /**
     * 
     * @return open_id 
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 
     * @param openId 
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}