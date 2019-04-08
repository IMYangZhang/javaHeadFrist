package com.example.headfirstjava.model.abstractFactory.styleFactory;

import com.example.headfirstjava.model.abstractFactory.coat.Icoat;
import com.example.headfirstjava.model.abstractFactory.hat.Ihat;
import com.example.headfirstjava.model.abstractFactory.shoes.Ishoes;

public interface StyleFactory {
    Icoat CreateCoat();
    Ihat CreateHat();
    Ishoes CreateShoes();
}
