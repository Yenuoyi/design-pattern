package abstractfactory;


/**
 * @author yebing
 */
public class Test {
	public static void main(String[] args){
		FactoryProducer producer = new FactoryProducer();
		
		AbstractFactory shapeFactory = producer.getFactory("SHAPE");
		Shape shape = shapeFactory.getShape(ShapeEnum.CIRCLE.name());
		shape.draw();
	}
}
