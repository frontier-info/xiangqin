package jp.frontierinfo.db.entity;

public class T01UserRelationsInfo extends T01UserRelationsInfoKey {
    private String relationLevel1;

    private String relationLevel2;

    public T01UserRelationsInfo(String uid, String relationId, String relationLevel1, String relationLevel2) {
        super(uid, relationId);
        this.relationLevel1 = relationLevel1;
        this.relationLevel2 = relationLevel2;
    }

    public T01UserRelationsInfo() {
        super();
    }

    public String getRelationLevel1() {
        return relationLevel1;
    }

    public void setRelationLevel1(String relationLevel1) {
        this.relationLevel1 = relationLevel1 == null ? null : relationLevel1.trim();
    }

    public String getRelationLevel2() {
        return relationLevel2;
    }

    public void setRelationLevel2(String relationLevel2) {
        this.relationLevel2 = relationLevel2 == null ? null : relationLevel2.trim();
    }
}