package memento;

/**
 * 备忘录模式
 * @author yebing
 */
public class MementoPatternDemo {
	   public static void main(String[] args) {
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #4");

	      System.out.println("Current State: " + originator.getState());        
	      System.out.println(careTaker.get(0).getState());
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	   }
	}