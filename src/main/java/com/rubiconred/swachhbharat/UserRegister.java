package com.rubiconred.swachhbharat;

public class UserRegister {
    private String uName;
    private String uPhone;
    private String uEmail;

    public UserRegister(String uName, String uPhone, String uEmail) {
        this.uName = uName;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
}
