package com.example.headfirstjava.model.abstractFactory.clothes;

import com.example.headfirstjava.model.abstractFactory.styleFactory.StyleFactory;
import com.example.headfirstjava.model.abstractFactory.coat.Icoat;
import com.example.headfirstjava.model.abstractFactory.hat.Ihat;
import com.example.headfirstjava.model.abstractFactory.shoes.Ishoes;

public class SpringSportClothes implements Iclothes {
    public Ishoes shoes;
    public Icoat coat;
    public Ihat hat;
    StyleFactory factory;

    public SpringSportClothes(StyleFactory factory){
        this.factory=factory;
    }
    @Override
    public void pack() {
        shoes=factory.CreateShoes();
        coat=factory.CreateCoat();
        hat=factory.CreateHat();
    }

    @Override
    public String getName() {
        return "SpringSportClothes";
    }
}
