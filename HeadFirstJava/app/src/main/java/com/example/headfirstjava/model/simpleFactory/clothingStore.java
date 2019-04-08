package com.example.headfirstjava.model.simpleFactory;

import com.example.headfirstjava.model.simpleFactory.Iclothes.Clothes;

public class clothingStore {
    public Clothes orderClothes(){
        Clothes clothes=ClothesFactory.getInstance("SportClothes");
        clothes.pack();
        return clothes;
    }
}
