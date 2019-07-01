package com.example.headfirstjava.model.decorator;

public class PotatoFriedMeat extends abstractDish {
    public PotatoFriedMeat(){
        description = "potatoAndMeat";
    }

    @Override
    public String costCondiment() {
        return "potatoAndMeat";
    }
}
