package com.example.headfirstjava.model.factoryMethod;

import com.example.headfirstjava.model.factoryMethod.abstractClass.clothesFactory;
import com.example.headfirstjava.model.factoryMethod.clothes.Clothes;
import com.example.headfirstjava.model.factoryMethod.clothes.springChildrenClothes;
import com.example.headfirstjava.model.factoryMethod.clothes.springSportClothes;

public class springFactory extends clothesFactory {
    @Override
    protected Clothes createClothes(String type) {
        if(type.equals("Children")){
            return new springChildrenClothes();
        }else if(type.equals("Sport")){
            return new springSportClothes();
        }
        return null;
    }

    @Override
    public void otherHandle() {

    }
}
