package com.dev.spring;

public class DatabaseOperations {
    private String url;
    private String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void save(String brand){
        System.out.printf("the item %s saved inside database\n",brand);
    }
    public void connect(){
        System.out.printf("connect to data base url %s with user %s\n",url,username);
    }
    public void disconnect(){
        System.out.printf("connect to data base url %s\n",url);
    }
}
