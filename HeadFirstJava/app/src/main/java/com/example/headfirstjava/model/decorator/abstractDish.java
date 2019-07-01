package com.example.headfirstjava.model.decorator;

public abstract class abstractDish {
    public String description;

    public String getDescription(){
        return description;
    }

   public abstract String costCondiment();
}
