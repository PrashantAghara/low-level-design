package problems.splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) {
        double amountShouldBePresent = amount / splits.size();
        for (Split split : splits) {
            if (split.getAmount() != amountShouldBePresent) {
                //throw exception
            }
        }
    }
}
