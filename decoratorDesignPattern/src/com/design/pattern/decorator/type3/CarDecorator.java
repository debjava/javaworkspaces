package com.design.pattern.decorator.type3;
public abstract class CarDecorator implements Car {
 
    protected Car car;
     
    public CarDecorator(Car c){
        this.car=c;
    }
     
    @Override
    public void assemble() {
        this.car.assemble();
    }
}