package jp.frontierinfo.db.entity;

public class T01UserRelationsInfo {
    private String uid;

    private String relationId;

    private Boolean isSend;

    private Boolean isRelation;

    public T01UserRelationsInfo(String uid, String relationId, Boolean isSend, Boolean isRelation) {
        this.uid = uid;
        this.relationId = relationId;
        this.isSend = isSend;
        this.isRelation = isRelation;
    }

    public T01UserRelationsInfo() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    public Boolean getIsSend() {
        return isSend;
    }

    public void setIsSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public Boolean getIsRelation() {
        return isRelation;
    }

    public void setIsRelation(Boolean isRelation) {
        this.isRelation = isRelation;
    }
}