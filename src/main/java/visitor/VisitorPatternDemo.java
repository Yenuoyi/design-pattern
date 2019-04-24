package visitor;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerPart keyboard = new Keyboard();
		keyboard.accept(new ComputerPartDisplayVisitor());
		}
}
