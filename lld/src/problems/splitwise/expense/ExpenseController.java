package problems.splitwise.expense;

import problems.splitwise.balance.BalanceSheetController;
import problems.splitwise.expense.split.ExpenseSplit;
import problems.splitwise.expense.split.Split;
import problems.splitwise.user.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        this.balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double amount, List<Split> splits, SplitType type, User paidBy) {
        ExpenseSplit expenseSplit = SplitFactory.getExpenseSplitByType(type);
        expenseSplit.validateSplitRequest(splits, amount);
        Expense expense = new Expense(expenseId, description, amount, paidBy, type, splits);
        balanceSheetController.updateUserExpenseBalanceSheet(paidBy, splits, amount);
        return expense;
    }
}
