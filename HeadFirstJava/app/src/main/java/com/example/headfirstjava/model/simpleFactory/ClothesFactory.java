package com.example.headfirstjava.model.simpleFactory;

import com.example.headfirstjava.model.simpleFactory.Iclothes.Clothes;
import com.example.headfirstjava.model.simpleFactory.clothes.ChildrenClothes;
import com.example.headfirstjava.model.simpleFactory.clothes.SportClothes;
import com.example.headfirstjava.model.simpleFactory.clothes.SuitClothes;

public class ClothesFactory {

    // 使用静态方法返回衣服对象
    public static Clothes getInstance(String type){
        Clothes clothes=null;
        if(type.equals("ChildrenClothes")){
            return new ChildrenClothes();
        }else if(type.equals("SportClothes")){
            return new SportClothes();
        }else if(type.equals("SuitClothes")){
            return new SuitClothes();
        }
        return clothes;
    }
}
