package com.rubiconred.swachhbharat;

import java.util.Scanner;

public class UserRegister {
    private String uName;
    private String uPhone;
    private String uEmail;

    public UserRegister() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        uName = sc.nextLine();
        System.out.println("Enter the phone number: ");
        uPhone = sc.nextLine();
        System.out.println("Enter the email-id: ");
        uEmail = sc.nextLine();
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
