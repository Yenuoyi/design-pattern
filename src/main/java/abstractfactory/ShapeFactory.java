package abstractfactory;

/**
 * @author yebing
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
			}    
		if(shapeType.equalsIgnoreCase(ShapeEnum.CIRCLE.name())){
			return new Circle();
			}
		if(shapeType.equalsIgnoreCase(ShapeEnum.RECTANGLE.name())){
			return new Rectangle();
			}
		if(shapeType.equalsIgnoreCase(ShapeEnum.SQUARE.name())){
			return new Square();
			}
		return null;
		}
	}