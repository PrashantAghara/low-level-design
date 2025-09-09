package problems.splitwise.expense;

import problems.splitwise.expense.split.Split;
import problems.splitwise.user.User;

import java.util.List;

public class Expense {
    String expenseId;
    String description;
    double ammount;
    User paidBy;
    SplitType splitType;
    List<Split> splits;

    public Expense(String expenseId, String description, double ammount, User paidBy, SplitType splitType, List<Split> splits) {
        this.expenseId = expenseId;
        this.description = description;
        this.ammount = ammount;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.splits = splits;
    }
}
