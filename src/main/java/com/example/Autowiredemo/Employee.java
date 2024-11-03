package com.example.Autowiredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired
    @Qualifier("hikeIs")
    private Hike hike;

//    Employee(){}
//
//    public Employee(Hike hike) {
//        this.hike = hike;
//        System.out.println("Constuctor");
//    }
//    public void setHike(Hike hike) {
//        this.hike = hike;
//        System.out.println("Stter Method called");
//    }

    public void ishike(){
        if(hike!=null){
            hike.hike();
        }
        else{
            System.out.println("Better Luck Next Time");
        }
    }
}
