package com.example.headfirstjava.model.abstractFactory.styleFactory;

import com.example.headfirstjava.model.abstractFactory.coat.GreenCoat;
import com.example.headfirstjava.model.abstractFactory.coat.Icoat;
import com.example.headfirstjava.model.abstractFactory.hat.BlackHat;
import com.example.headfirstjava.model.abstractFactory.hat.Ihat;
import com.example.headfirstjava.model.abstractFactory.shoes.Ishoes;
import com.example.headfirstjava.model.abstractFactory.shoes.RedShoes;

public class ManStyleFactory implements StyleFactory {

    @Override
    public Icoat CreateCoat() {
        return new GreenCoat();
    }

    @Override
    public Ihat CreateHat() {
        return new BlackHat();
    }

    @Override
    public Ishoes CreateShoes() {
        return new RedShoes();
    }
}
