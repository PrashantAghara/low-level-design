package dp.interpreter;

public class NonTerminalExpression implements AbstractExpression {
    AbstractExpression left;
    AbstractExpression right;

    public NonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
