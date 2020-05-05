package com.gmail.moshen1ser2.contactlistapp;

public class Contact {
    private final String name ;
    private final String number1;
    private final String number2;
    private final int photo;

    public Contact(String name, String number1, String number2, int photo){
        this.name = name;
        this.number1 = number1;
        this.number2 = number2;
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
