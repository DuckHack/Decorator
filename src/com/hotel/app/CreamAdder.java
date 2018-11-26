package com.hotel.app;

public class CreamAdder extends Decorator {
    private String ingredientName = "Cream";
    private int price = 10;
    private AbstractCake abstractCake;
    CreamAdder(AbstractCake abstractCake){
        this.abstractCake = abstractCake;
    }
    @Override
    public String ingrs(){
        return abstractCake.ingrs() + this.ingredientName + " ";
    }
    @Override
    public Integer price(int volume){
        return abstractCake.price(volume) + this.price * volume;
    }
}
