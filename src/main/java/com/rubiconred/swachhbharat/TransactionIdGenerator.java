package com.rubiconred.swachhbharat;

public class TransactionIdGenerator {

    private String name;
    private String phone;
    private int id;

    public TransactionIdGenerator(User user) {
        this.name = user.getuName();
        this.phone = user.getuPhone();


    }

    public int getId() {
        int id = this.name.hashCode() + this.phone.hashCode();
        int length = String.valueOf(id).length();
        int Max_Length = 5;
        if (String.valueOf(id).length() > Max_Length) {
            id = (int) (id / Math.pow(10.0, length - Max_Length));
        }
        return id;

    }
}
