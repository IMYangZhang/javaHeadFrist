package com.example.headfirstjava.model.decorator;

import android.util.Log;

import com.example.headfirstjava.model.decorator.condimentDecorator.chili;
import com.example.headfirstjava.model.decorator.condimentDecorator.salt;

public class doDecorator {
    private static final String TAG = "DoDecoretor";

    public String execute() {
        abstractDish Mydish = new PotatoFriedMeat();
        Mydish = new chili(Mydish);
        Mydish = new salt(Mydish);

        String result = "cost:"+Mydish.costCondiment()+"  descropton:"+Mydish.getDescription();
        Log.i(TAG, "execute: "+  result);
        return result;
    }
}
