package FactoryPattern;

public class MainClass {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("Circle");
		Shape shape1 = factory.getShape("Square");
		shape1.draw();

	}

}
