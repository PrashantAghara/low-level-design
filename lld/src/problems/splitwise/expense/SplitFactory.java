package problems.splitwise.expense;

import problems.splitwise.expense.split.EqualExpenseSplit;
import problems.splitwise.expense.split.ExpenseSplit;
import problems.splitwise.expense.split.PercentageExpenseSplit;
import problems.splitwise.expense.split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getExpenseSplitByType(SplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                return null;
            }
        }
    }
}
