package com.example.madrisastudentapp;

public class Student {
    String Name;
    String Date;
    int[] Sabaq; //array of 3 elements, 1st element --> Surah Number other 2 will be ayah number, starting and ending
    int Sabaqi; //Previous Parah
    int Manzil; //From 1st parah till Sabqi
    String sabaqComments;
    String sabaqiComments;
    String manzilComments;

    public Student(String Name, String Date, int[] Sabaq, int Sabaqi, int Manzil, String sabaqComments, String sabaqiComments, String manzilComments){
        this.Date = Date;
        this.Name = Name;
        this.Manzil = Manzil;
        this.manzilComments = manzilComments;
        this.Sabaq = Sabaq;
        this.sabaqComments = sabaqComments;
        this.Sabaqi = Sabaqi;
        this.sabaqiComments = sabaqiComments;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int[] getSabaq() {
        return Sabaq;
    }

    public void setSabaq(int[] Sabaq) {
        this.Sabaq = Sabaq;
    }

    public int getSabaqi() {
        return Sabaqi;
    }

    public void setSabaqi(int Sabaqi) {
        this.Sabaqi = Sabaqi;
    }

    public int getManzil() {
        return Manzil;
    }

    public void setManzil(int Manzil) {
        this.Manzil = Manzil;
    }

    public String getmanzilComments() {
        return manzilComments;
    }

    public void setmanzilComments(String manzilComments) {
        this.manzilComments = manzilComments;
    }

    public String getsabaqComments() {
        return sabaqComments;
    }

    public void setsabaqComments(String sabaqComments) {
        this.sabaqComments = sabaqComments;
    }

    public String getsabaqiComments() {
        return sabaqiComments;
    }

    public void setsabaqiComments(String sabaqiComments) {
        this.sabaqiComments = sabaqiComments;
    }

}
