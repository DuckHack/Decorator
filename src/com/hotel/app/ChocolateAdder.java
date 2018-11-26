package com.hotel.app;

public class ChocolateAdder extends Decorator {
    private String ingredientName = "Chocolate";
    private int price = 15;
    private AbstractCake abstractCake;
    ChocolateAdder(AbstractCake abstractCake){
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
