package com.haiwai.bigdata.model;

import java.io.Serializable;
import java.util.Date;

public class BigdataResources implements Serializable {
    private Integer id;

    /**
     * 资源编码
     *
     * @mbggenerated
     */
    private Integer resourcesCode;

    /**
     * 资源名称
     *
     * @mbggenerated
     */
    private String resourcesName;

    /**
     * 资源描述
     *
     * @mbggenerated
     */
    private String resourcesDesc;

    /**
     * 0未启用，1启用，2禁用
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * url排序
     *
     * @mbggenerated
     */
    private Integer urlNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourcesCode() {
        return resourcesCode;
    }

    public void setResourcesCode(Integer resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getResourcesName() {
        return resourcesName;
    }

    public void setResourcesName(String resourcesName) {
        this.resourcesName = resourcesName;
    }

    public String getResourcesDesc() {
        return resourcesDesc;
    }

    public void setResourcesDesc(String resourcesDesc) {
        this.resourcesDesc = resourcesDesc;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUrlNum() {
        return urlNum;
    }

    public void setUrlNum(Integer urlNum) {
        this.urlNum = urlNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resourcesCode=").append(resourcesCode);
        sb.append(", resourcesName=").append(resourcesName);
        sb.append(", resourcesDesc=").append(resourcesDesc);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", urlNum=").append(urlNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}