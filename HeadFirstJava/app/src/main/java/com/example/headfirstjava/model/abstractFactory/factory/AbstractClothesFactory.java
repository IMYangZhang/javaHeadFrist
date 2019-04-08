package com.example.headfirstjava.model.abstractFactory.factory;

import com.example.headfirstjava.model.abstractFactory.clothes.Iclothes;

public abstract class AbstractClothesFactory {
    Iclothes clothes;

    public Iclothes orderClothes(String type){
        clothes = createClothes(type);
        clothes.getName();
        clothes.pack();
        return clothes;

    }

    protected abstract Iclothes createClothes(String type);


}
