package jp.frontierinfo.db.entity;

public class M01PulldownInfoKey {
    private String pulldownCode;

    private String pulldownValue;

    public M01PulldownInfoKey(String pulldownCode, String pulldownValue) {
        this.pulldownCode = pulldownCode;
        this.pulldownValue = pulldownValue;
    }

    public M01PulldownInfoKey() {
        super();
    }

    public String getPulldownCode() {
        return pulldownCode;
    }

    public void setPulldownCode(String pulldownCode) {
        this.pulldownCode = pulldownCode == null ? null : pulldownCode.trim();
    }

    public String getPulldownValue() {
        return pulldownValue;
    }

    public void setPulldownValue(String pulldownValue) {
        this.pulldownValue = pulldownValue == null ? null : pulldownValue.trim();
    }
}