package jp.frontierinfo.db.entity;

public class M01CodeMasterInfo extends M01CodeMasterInfoKey {
    private String codeTypeName;

    private String masterName;

    public M01CodeMasterInfo(String codeType, String masterCode, String codeTypeName, String masterName) {
        super(codeType, masterCode);
        this.codeTypeName = codeTypeName;
        this.masterName = masterName;
    }

    public M01CodeMasterInfo() {
        super();
    }

    public String getCodeTypeName() {
        return codeTypeName;
    }

    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName == null ? null : codeTypeName.trim();
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName == null ? null : masterName.trim();
    }
}