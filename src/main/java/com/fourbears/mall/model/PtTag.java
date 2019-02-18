package com.fourbears.mall.model;

import java.io.Serializable;
import java.util.Date;

public class PtTag implements Serializable {
    private Long id;

    /**
     * 编号
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 注册号
     *
     * @mbggenerated
     */
    private String reg;

    /**
     * 注册号(bak)
     *
     * @mbggenerated
     */
    private String reg1;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 设备型号(尺寸)
     *
     * @mbggenerated
     */
    private Integer tagModel;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 启用状态：0->启用；1->禁用
     *
     * @mbggenerated
     */
    private Integer opreaStatus;

    /**
     * 运行状态：0->正常；1->欠电；2->故障
     *
     * @mbggenerated
     */
    private Integer runStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getReg1() {
        return reg1;
    }

    public void setReg1(String reg1) {
        this.reg1 = reg1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTagModel() {
        return tagModel;
    }

    public void setTagModel(Integer tagModel) {
        this.tagModel = tagModel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOpreaStatus() {
        return opreaStatus;
    }

    public void setOpreaStatus(Integer opreaStatus) {
        this.opreaStatus = opreaStatus;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", reg=").append(reg);
        sb.append(", reg1=").append(reg1);
        sb.append(", description=").append(description);
        sb.append(", tagModel=").append(tagModel);
        sb.append(", createTime=").append(createTime);
        sb.append(", opreaStatus=").append(opreaStatus);
        sb.append(", runStatus=").append(runStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}