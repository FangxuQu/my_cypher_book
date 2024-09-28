package com.qufangxu.mycipherbook.cipher.entity;

public class MyCipherBook {
    /**
     * id,主键
     */
    private int id;
    /**
     * 账号
     */
    private String account;
    /**
     * 应用名称
     */
    private String applicationName;
    /**
     * 应用类型
     */
    private String applicationType;
    /**
     * 游戏大区
     */
    private String area;
    /**
     * 密码
     */
    private String password;
    /**
     * 备注
     */
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
