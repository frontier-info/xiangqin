package jp.frontierinfo.db.entity;

public class T01UserRelationsInfoKey {
    private String uid;

    private String relationId;

    public T01UserRelationsInfoKey(String uid, String relationId) {
        this.uid = uid;
        this.relationId = relationId;
    }

    public T01UserRelationsInfoKey() {
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
}