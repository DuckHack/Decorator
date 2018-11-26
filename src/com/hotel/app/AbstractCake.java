package com.hotel.app;

abstract public class AbstractCake {
    String ingredientName = "Ingridients";
    int price = 10;

    public String ingrs(){
        return this.ingredientName;
    }

    public Integer price(int volume){
        return this.price * volume;
    }
}
