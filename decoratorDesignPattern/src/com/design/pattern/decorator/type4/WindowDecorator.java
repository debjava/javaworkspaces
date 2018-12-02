package com.design.pattern.decorator.type4;
abstract class WindowDecorator implements Window {
    protected Window windowToBeDecorated; // the Window being decorated
 
    public WindowDecorator (Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }
    public void draw() {
        windowToBeDecorated.draw(); //Delegation
    }
    public String getDescription() {
        return windowToBeDecorated.getDescription(); //Delegation
    }
}