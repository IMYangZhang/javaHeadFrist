package com.example.headfirstjava.model.factoryMethod;

import com.example.headfirstjava.model.factoryMethod.abstractClass.clothesFactory;
import com.example.headfirstjava.model.factoryMethod.clothes.Clothes;
import com.example.headfirstjava.model.factoryMethod.clothes.winterChildrenClothes;
import com.example.headfirstjava.model.factoryMethod.clothes.winterSportClothes;

public class winterFactory extends clothesFactory {
    @Override
    protected Clothes createClothes(String type) {
        if(type.equals("Children")){
            return new winterChildrenClothes();
        }else if(type.equals("Sport")){
            return new winterSportClothes();
        }
        return null;
    }

    @Override
    public void otherHandle() {

    }
}
