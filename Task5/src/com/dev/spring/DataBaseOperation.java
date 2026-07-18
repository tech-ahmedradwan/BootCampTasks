package com.dev.spring;

public class DataBaseOperation {
    private String url;
    private String userName;
    private String password;

    public void connectToDB(){
        System.out.printf("connecting to database %s and with user %s\n",url,userName);
    }

    public void disconnectToDB(){
        System.out.printf("disconnected to database %s\n",url);
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
