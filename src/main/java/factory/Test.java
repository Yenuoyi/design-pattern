package factory;

/**
 * @author yebing
 */
public class Test {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
			Shape shape1 = factory.getShape(ShapeEnum.CIRCLE.getAddress());
			shape1.draw();
			Shape shape2 = factory.getShape(ShapeEnum.RECTANGLE.getAddress());
			shape2.draw();
			Shape shape3 = factory.getShape(ShapeEnum.SQUARE.getAddress());
			shape3.draw();
	}
}
