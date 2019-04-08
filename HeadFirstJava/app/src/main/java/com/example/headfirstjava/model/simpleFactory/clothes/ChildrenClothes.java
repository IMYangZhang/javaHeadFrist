package com.example.headfirstjava.model.simpleFactory.clothes;

import com.example.headfirstjava.model.simpleFactory.Iclothes.Clothes;

public class ChildrenClothes implements Clothes {
    @Override
    public String getName(){
        return "childrenClothes";
    }

    @Override
    public void pack() {

    }
}
