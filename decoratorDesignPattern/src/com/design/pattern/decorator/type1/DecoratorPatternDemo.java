package com.design.pattern.decorator.type1;
public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new Circle();
		//Normal Circle
		System.out.println("Normal Circle");
		circle.draw();

		System.out.println("Circle with border");
		Shape redCircle = new RedShapeDecorator(circle);
		redCircle.draw();

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}