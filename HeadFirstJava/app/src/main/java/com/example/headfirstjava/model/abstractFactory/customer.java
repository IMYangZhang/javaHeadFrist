package com.example.headfirstjava.model.abstractFactory;

import com.example.headfirstjava.model.abstractFactory.clothes.Iclothes;
import com.example.headfirstjava.model.abstractFactory.clothes.SpringChildrenClothes;
import com.example.headfirstjava.model.abstractFactory.factory.AbstractClothesFactory;
import com.example.headfirstjava.model.abstractFactory.factory.SpringFactory;
import com.example.headfirstjava.model.abstractFactory.styleFactory.ManStyleFactory;
import com.example.headfirstjava.model.abstractFactory.styleFactory.StyleFactory;

public class customer {
    // 购买春天的儿童款套装
    public Iclothes buy(){
        StyleFactory styleFactory=new ManStyleFactory();
        AbstractClothesFactory factory=new SpringFactory(styleFactory);
        Iclothes clothes=factory.orderClothes("Sport");
        return clothes;
    }
}
