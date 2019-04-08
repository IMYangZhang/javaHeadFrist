package com.example.headfirstjava.model.abstractFactory.styleFactory;

import com.example.headfirstjava.model.abstractFactory.coat.Icoat;
import com.example.headfirstjava.model.abstractFactory.coat.RedCoat;
import com.example.headfirstjava.model.abstractFactory.hat.Ihat;
import com.example.headfirstjava.model.abstractFactory.hat.YellowHat;
import com.example.headfirstjava.model.abstractFactory.shoes.BlueShoes;
import com.example.headfirstjava.model.abstractFactory.shoes.Ishoes;

public class YoungStyleFactory implements StyleFactory {

    @Override
    public Icoat CreateCoat() {
        return new RedCoat();
    }

    @Override
    public Ihat CreateHat() {
        return new YellowHat();
    }

    @Override
    public Ishoes CreateShoes() {
        return new BlueShoes();
    }
}
