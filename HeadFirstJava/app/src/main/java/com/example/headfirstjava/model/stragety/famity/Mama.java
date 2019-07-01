package com.example.headfirstjava.model.stragety.famity;

import com.example.headfirstjava.model.stragety.behavior.EatHot;
import com.example.headfirstjava.model.stragety.behavior.SportRun;
import com.example.headfirstjava.model.stragety.iStregaty.abstrateFamity;

public class Mama extends abstrateFamity {
    public Mama(){
        itaste=new EatHot();
        isports=new SportRun();
    }
    @Override
    public void display() {

    }
}
