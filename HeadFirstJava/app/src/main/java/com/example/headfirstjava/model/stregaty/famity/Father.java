package com.example.headfirstjava.model.stregaty.famity;

import com.example.headfirstjava.model.stregaty.behavior.EatHot;
import com.example.headfirstjava.model.stregaty.behavior.SportPoker;
import com.example.headfirstjava.model.stregaty.iStregaty.abstrateFamity;

public class Father extends abstrateFamity {

    public Father(){
        itaste=new EatHot();
        isports=new SportPoker();
    }
    @Override
    public void display() {
        itaste.eatFavorite();
        isports=new SportPoker();
    }
}

