package com.example.headfirstjava.model.stregaty;

import com.example.headfirstjava.model.stregaty.behavior.EatHot;
import com.example.headfirstjava.model.stregaty.behavior.SportRun;
import com.example.headfirstjava.model.stregaty.famity.Father;
import com.example.headfirstjava.model.stregaty.famity.Mama;

public class MainStregaty {
    Father father=new Father();
    Mama mama=new Mama();
    public String doSomething(){
        StringBuffer str=new StringBuffer(30);
        str.append(father.performSport()+" "+father.performTaste()+"/r/n");
        str.append(mama.performSport()+" "+mama.performTaste()+"/r/n");
        father.setSport(new SportRun());
        father.setItaste(new EatHot());
        mama.setSport(new SportRun());
        mama.setItaste(new EatHot());
        str.append(father.performSport()+" "+father.performTaste()+"/r/n");
        str.append(mama.performSport()+" "+mama.performTaste()+"/r/n");
        return str.toString();
    }
}
