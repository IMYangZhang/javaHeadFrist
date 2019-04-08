package com.example.headfirstjava.model.simpleFactory.clothes;

import com.example.headfirstjava.model.simpleFactory.Iclothes.Clothes;

public class SuitClothes implements Clothes {
    @Override
    public String getName(){
        return "suit";
    }

    @Override
    public void pack() {

    }
}
