package com.example.headfirstjava.model.decorator.condimentDecorator;

import com.example.headfirstjava.model.decorator.abstractCondiment;
import com.example.headfirstjava.model.decorator.abstractDish;

public class chili extends abstractCondiment {
    private abstractDish dish;

    public chili(abstractDish dish){
        this.dish = dish;
    }

    @Override
    public String getDescription() {
        return dish.getDescription()+"& chili";
    }

    @Override
    public String costCondiment() {
        return dish.costCondiment()+"& chili";
    }
}
