package com.company;

abstract class Criteria {

    public void exams(){

        System.out.println("All the exams are completed and PASS");
    }

    public void assignment(){

        System.out.println("All the assignments are submitted");
    }

    public void activities(){
        System.out.println("All activities are reviewed and approved");
    }

    abstract void finalProject();

    public void courseFee(){

        System.out.println("Fully paid");
    }

}
