package com.liuchao.springboot.mapper.model;

import java.util.Date;

/**
 * @author liuchao
 */
public class AdsEntity {

    private Long id;
    private String name;
    private Long seqNo;
    private String imgUrl;
    private String refUrl;
    private Integer enabled;
    private Date created;
    private Date updated;
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRefUrl() {
        return refUrl;
    }

    public void setRefUrl(String refUrl) {
        this.refUrl = refUrl;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "AdsEntity [id=" + id + ", name=" + name + ", seqNo=" + seqNo + ", imgUrl=" + imgUrl + ", refUrl="
                + refUrl + ", enabled=" + enabled + ", created=" + created + ", updated=" + updated + "]";
    }

}
