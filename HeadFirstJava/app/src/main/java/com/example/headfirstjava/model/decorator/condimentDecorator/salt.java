package com.example.headfirstjava.model.decorator.condimentDecorator;

import com.example.headfirstjava.model.decorator.abstractCondiment;
import com.example.headfirstjava.model.decorator.abstractDish;

public class salt extends abstractCondiment {
    private abstractDish dish;


    public salt(abstractDish dish) {
        this.dish = dish;
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + "& salt";
    }

    @Override
    public String costCondiment() {
        return dish.costCondiment() + "& salt";
    }
}
