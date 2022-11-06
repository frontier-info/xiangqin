package jp.frontierinfo.db.entity;

public class T01UserRelationsInfo extends T01UserRelationsInfoKey {
    private Boolean isSend;

    private Boolean isRelation;

    public T01UserRelationsInfo(String uid, String relationId, Boolean isSend, Boolean isRelation) {
        super(uid, relationId);
        this.isSend = isSend;
        this.isRelation = isRelation;
    }

    public T01UserRelationsInfo() {
        super();
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