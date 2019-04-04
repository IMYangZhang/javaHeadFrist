package com.example.headfirstjava.model.stregaty.famity;

import com.example.headfirstjava.model.stregaty.behavior.EatHot;
import com.example.headfirstjava.model.stregaty.behavior.SportRun;
import com.example.headfirstjava.model.stregaty.iStregaty.abstrateFamity;

public class Mama extends abstrateFamity {
    public Mama(){
        itaste=new EatHot();
        isports=new SportRun();
    }
    @Override
    public void display() {

    }
}
