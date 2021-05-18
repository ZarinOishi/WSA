package com.zarinoishi.womensafetyapp;

public class User {
    public String name;
    public String email;
    public String avata;
    public String password;
    public boolean isOnline = true;


    public boolean registration(String email,String username, String password) {
        this.password = password;
        this.name = username;
        this.email = email;
        return true;
    }
    public boolean login(String email, String password) {
        if(email==this.email && password == this.password) {
            return true;
        }
        return false;
    }
    public boolean changeStatus() {
        isOnline = false;
        return false;
    }
    public boolean getStatus() {
        return isOnline;
    }
}
