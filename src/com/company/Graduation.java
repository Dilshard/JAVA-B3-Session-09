package com.company;

public class Graduation extends Criteria {

    public Graduation(String studentName){

        System.out.println("Hi, "+studentName);

    }

    public Graduation(int mk1){
        System.out.println("This is a constructor without any arguments");
    }

    public void finalProject(){

        System.out.println("Final projects submitted!");
    }



}
