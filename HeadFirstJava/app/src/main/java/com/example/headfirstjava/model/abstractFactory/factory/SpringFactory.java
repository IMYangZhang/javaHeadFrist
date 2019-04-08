package com.example.headfirstjava.model.abstractFactory.factory;

import com.example.headfirstjava.model.abstractFactory.styleFactory.StyleFactory;
import com.example.headfirstjava.model.abstractFactory.clothes.Iclothes;
import com.example.headfirstjava.model.abstractFactory.clothes.SpringChildrenClothes;
import com.example.headfirstjava.model.abstractFactory.clothes.SpringSportClothes;

public class SpringFactory extends AbstractClothesFactory {
    StyleFactory factory;
    public SpringFactory(StyleFactory factory){
        this.factory=factory;
    }

    @Override
    protected Iclothes createClothes(String type) {
        Iclothes clothes;

        if (type.equals("Sport")) {
            clothes = new SpringSportClothes(this.factory);
        } else if (type.equals("Children")) {
            clothes = new SpringChildrenClothes(this.factory);
        } else {
            clothes = null;
        }
        return clothes;
    }
}
