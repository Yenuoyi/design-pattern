package strategy;

/**
 * 策略模式，定义一个统一策略接口，实现N种策略，在使用策略的类种定义策略接口，在构建函数时动态注入策略，从而实现动态策略
 * @author yebing
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
