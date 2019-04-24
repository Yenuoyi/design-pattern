package abstractfactory;

/**
 * @author yebing
 */
public class FactoryProducer {
	public AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      }
	      return null;
	   }
}
