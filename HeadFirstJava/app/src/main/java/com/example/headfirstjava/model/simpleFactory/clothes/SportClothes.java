package com.example.headfirstjava.model.simpleFactory.clothes;

import com.example.headfirstjava.model.simpleFactory.Iclothes.Clothes;

public class SportClothes implements Clothes {
    @Override
    public String getName(){
        return "sportClothes";
    }

    @Override
    public void pack() {

    }
}
