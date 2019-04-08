package com.example.headfirstjava.model.factoryMethod;

import com.example.headfirstjava.model.factoryMethod.clothes.Clothes;

public class customer {

    public Clothes buyClothes(){
        Clothes clothes;
        springFactory springF=new springFactory();
        winterFactory winterF = new winterFactory();
        clothes = springF.createClothes("Sport");
        // clothes = winterF.createClothes("Children");
        return clothes;
    }
}
