package interpreter;

/**
 * @author yebing
 */
public interface Expression {
    /**
     * 解释动作
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
