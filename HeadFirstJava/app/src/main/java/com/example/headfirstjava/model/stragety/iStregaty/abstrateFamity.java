package com.example.headfirstjava.model.stragety.iStregaty;

public abstract class abstrateFamity {
    public Isports isports;
    public Itaste itaste;
    public abstrateFamity(){

    }

    public String sleep(){
        return "sleep";
    }
    public String eat(){
        return "eat";
    }
    public void setSport(Isports isp){
        isports=isp;
    }
    public void setItaste(Itaste ita){
        itaste=ita;
    }
    public String performTaste(){
        return itaste.eatFavorite();
    }
    public String performSport(){
        return isports.sportsFavorite();
    }

    public abstract void display();
}
