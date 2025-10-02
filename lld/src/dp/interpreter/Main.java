package dp.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("A", 5);
        context.put("B", 10);

        AbstractExpression left = new NumberTerminalExpression("A");
        AbstractExpression right = new NumberTerminalExpression("B");
        AbstractExpression multiply = new NonTerminalExpression(left, right);
        int ans = multiply.interpret(context);
        System.out.println("Ans is : " + ans);
    }
}
