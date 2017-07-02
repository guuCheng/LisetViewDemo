package com.example.gucheng.lisetviewdemo;

/**
 * Created by gucheng on 2017/7/2.
 */

//自定义一个类
public class Person {
    private String name;
    private String phoneNumber;
    private int imageId;

    public Person(int imageId,String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        imageId = imageId;
    }
}
