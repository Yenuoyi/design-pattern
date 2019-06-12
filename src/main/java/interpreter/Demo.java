package interpreter;

/**
 * @author yebing
 */
public class Demo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("man");
        Expression john = new TerminalExpression("women");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("This is man or women? " + isMale.interpret("man"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
