package com.fourbears.mall.model;

import java.io.Serializable;
import java.util.Date;

public class PtTagContent implements Serializable {
    private Long id;

    /**
     * 编号
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 模板编号
     *
     * @mbggenerated
     */
    private String temCode;

    /**
     * 内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 是否促销：0->否；1->是
     *
     * @mbggenerated
     */
    private Integer promotionStatus;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date modTime;

    /**
     * 修改人
     *
     * @mbggenerated
     */
    private String modUser;

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

    public String getTemCode() {
        return temCode;
    }

    public void setTemCode(String temCode) {
        this.temCode = temCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(Integer promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", temCode=").append(temCode);
        sb.append(", content=").append(content);
        sb.append(", promotionStatus=").append(promotionStatus);
        sb.append(", modTime=").append(modTime);
        sb.append(", modUser=").append(modUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}