package com.example.headfirstjava.model.abstractFactory.factory;

import com.example.headfirstjava.model.abstractFactory.styleFactory.StyleFactory;
import com.example.headfirstjava.model.abstractFactory.clothes.Iclothes;
import com.example.headfirstjava.model.abstractFactory.clothes.WinterChildrenClothes;
import com.example.headfirstjava.model.abstractFactory.clothes.WinterSportClothes;

public class WinterFactory extends AbstractClothesFactory {
    StyleFactory factory;
    public WinterFactory(StyleFactory factory){
        this.factory=factory;
    }
    @Override
    protected Iclothes createClothes(String type) {
        Iclothes clothes;
        if(type.equals("Sport")){
            clothes = new WinterSportClothes(this.factory);
        }else if (type.equals("Children")){
            clothes= new WinterChildrenClothes(this.factory);
        }else {
            clothes=null;
        }
        return clothes;
    }
}
