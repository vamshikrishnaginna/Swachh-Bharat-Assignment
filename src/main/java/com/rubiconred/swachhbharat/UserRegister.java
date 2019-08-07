package com.rubiconred.swachhbharat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    private String uName;
    private String uPhone;
    private String uEmail;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final String PHONE_PATTERN = "[7-9][0-9]{9}";

    private Pattern patternEmail;
    private Pattern patternPhoneNumber;
    private Matcher matcher;


    public UserRegister() {

        patternEmail = Pattern.compile(EMAIL_PATTERN);
        patternPhoneNumber = Pattern.compile(PHONE_PATTERN);

        Scanner sc = new Scanner(System.in);
        System.out.println("          Register Here          ");
        System.out.println("=================================");
        System.out.println("Enter the name: ");
        uName = sc.nextLine();
        System.out.println("Enter the phone number: ");
        uPhone = sc.nextLine();
        while (!isValid(uPhone)) {
            System.out.println("Enter the valid Phone Number..!!");
            uPhone = sc.nextLine();

        }

        System.out.println("Enter the email-id: ");
        uEmail = sc.nextLine();
        System.out.println(checkEmail(uEmail));

        while (!checkEmail(uEmail)) {
            System.out.println("Enter the valid mail..!!");
            uEmail = sc.nextLine();

        }
        System.out.println("=================================");

    }

    private boolean checkPhoneNumber(String uPhone) {
        matcher = patternEmail.matcher(uPhone);
        return matcher.matches();
    }

    private boolean checkEmail(String uEmail) {
        matcher = patternPhoneNumber.matcher(uEmail);
        return matcher.matches();
    }

    public static boolean isValid(String s) {
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // 1) Begins with 0 or 91
        // 2) Then contains 7 or 8 or 9.
        // 3) Then contains 9 digits
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
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
