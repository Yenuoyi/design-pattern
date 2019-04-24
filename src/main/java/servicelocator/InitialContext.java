package servicelocator;

public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("ServiceOneImpl")){
            System.out.println("Looking up and creating a new ServiceOneImpl object");
            return new ServiceOneImpl();
        }else if (jndiName.equalsIgnoreCase("ServiceTwoImpl")){
            System.out.println("Looking up and creating a new ServiceTwoImpl object");
            return new ServiceTwoImpl();
        }
        return null;
    }
}
