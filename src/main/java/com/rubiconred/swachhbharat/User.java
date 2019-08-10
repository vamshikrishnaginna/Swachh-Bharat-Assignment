//model class

package com.rubiconred.swachhbharat;

public class User {
    private String uName;
    private String uPhone;
    private String uEmail;

    public User() {
        UserRegister register = new UserRegister();
        uName = register.getuName();
        uPhone = register.getuPhone();
        uEmail = register.getuEmail();


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

    public String toString() {
        return uName + "\n" + uPhone + "\n" + uEmail;
    }


}
