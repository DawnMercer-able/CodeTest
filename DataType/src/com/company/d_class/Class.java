package com.company.d_class;

public class Class {

    private String name;

    private String id;

    private String passWord;

    private String nickName;

    public Class (){

    }

    public Class (String name, String id, String passWord, String nickName) {

        this.name = name;

        this.id = id;

        this.passWord = passWord;

        this.nickName = nickName;

    }

    /*
    *Setter和Getter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
