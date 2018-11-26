package com.hotel.app;

public class NutsAdder extends Decorator {
    private String ingredientName = "Nuts";
    private int price = 20;
    private AbstractCake abstractCake;
    NutsAdder(AbstractCake abstractCake){
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
    //Hello
}
