package com.example.petcare;

public class MainModel {

    String title,age,breed,gender,phone,price,purl;

    MainModel()
    {

    }

    public MainModel(String title, String age, String breed, String gender, String phone, String price, String purl) {
        this.title = title;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.phone = phone;
        this.price = price;
        this.purl = purl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
