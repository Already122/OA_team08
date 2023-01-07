package com.gzf.bean;

public class UserBean {
    private int ID;
    private String UserName;
    private String Password;
    private String RealName;
    private int RoleID;
    private int DocTitleID;
    private String IsScheduling;
    private int DeptID;
    private int RegistLeID;
    private int DelMark;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public int getDocTitleID() {
        return DocTitleID;
    }

    public void setDocTitleID(int docTitleID) {
        DocTitleID = docTitleID;
    }

    public String getIsScheduling() {
        return IsScheduling;
    }

    public void setIsScheduling(String isScheduling) {
        IsScheduling = isScheduling;
    }

    public int getDeptID() {
        return DeptID;
    }

    public void setDeptID(int deptID) {
        DeptID = deptID;
    }

    public int getRegistLeID() {
        return RegistLeID;
    }

    public void setRegistLeID(int registLeID) {
        RegistLeID = registLeID;
    }

    public int getDelMark() {
        return DelMark;
    }

    public void setDelMark(int delMark) {
        DelMark = delMark;
    }

}
