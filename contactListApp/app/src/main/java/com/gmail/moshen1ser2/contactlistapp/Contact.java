package com.gmail.moshen1ser2.contactlistapp;

public class Contact {
    private String name ;
    private String number1;
    private String number2;
    private int photo;

    public Contact(String name, String number1, String number2, int photo){
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
        this.photo = photo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber1(String number1){
        this.number1 = number1;
    }

    public void setNumber2(String number2){
        this.number2 = number2;
    }

    public void setPhoto(int photo){
        this.photo = photo;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber1(){
        return this.number1;
    }

    public String getNumber2(){
        return this.number2;
    }

    public int getPhoto(){
        return this.photo;
    }
}
