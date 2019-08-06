package com.rubiconred.swachhbharat;

import java.util.Scanner;

public class UserRegister {
    private String uName;
    private String uPhone;
    private String uEmail;

    public UserRegister() {
        Scanner sc = new Scanner(System.in);
        System.out.println("          Register Here          ");
        System.out.println("=================================");
        System.out.println("Enter the name: ");
        uName = sc.nextLine();
        System.out.println("Enter the phone number: ");
        uPhone = sc.nextLine();
        System.out.println("Enter the email-id: ");
        uEmail = sc.nextLine();
        System.out.println("=================================");

    }

    public String getuName() {
        return uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }


}
