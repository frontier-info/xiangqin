package jp.frontierinfo.db.entity;

public class M01CodeMasterInfoKey {
    private String codeType;

    private String masterCode;

    public M01CodeMasterInfoKey(String codeType, String masterCode) {
        this.codeType = codeType;
        this.masterCode = masterCode;
    }

    public M01CodeMasterInfoKey() {
        super();
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getMasterCode() {
        return masterCode;
    }

    public void setMasterCode(String masterCode) {
        this.masterCode = masterCode == null ? null : masterCode.trim();
    }
}