package com.example.headfirstjava.model.factoryMethod.abstractClass;


import com.example.headfirstjava.model.factoryMethod.clothes.Clothes;

public abstract class clothesFactory {
    Clothes clothes;
    public Clothes orderClothes(String type){
        clothes = createClothes(type);
        clothes.getName();
        clothes.pack();
        return clothes;
    }

    protected abstract Clothes createClothes(String type);

    // 自定义的处理方式
    public abstract void otherHandle();
}
