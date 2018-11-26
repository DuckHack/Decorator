package com.hotel.app;

public class CakeBase extends AbstractCake {
    String ingredientName = "Base";
    int price = 5;

    @Override
    public String ingrs(){
        return this.ingredientName + " ";
    }
    @Override
    public Integer price(int volume){
        return this.price * volume;
    }
}
