package com.example.headfirstjava.model.stragety.famity;

import com.example.headfirstjava.model.stragety.behavior.EatHot;
import com.example.headfirstjava.model.stragety.behavior.SportPoker;
import com.example.headfirstjava.model.stragety.iStregaty.abstrateFamity;

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

