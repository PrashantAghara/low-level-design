package problems.splitwise.group;

import problems.splitwise.expense.Expense;
import problems.splitwise.expense.ExpenseController;
import problems.splitwise.expense.SplitType;
import problems.splitwise.expense.split.Split;
import problems.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String id;
    String name;
    List<User> users;
    List<Expense> expenses;
    ExpenseController expenseController;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
        this.expenses = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenses.add(expense);
        return expense;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public String getGroupId() {
        return id;
    }

    public void setGroupId(String groupId) {
        this.id = groupId;
    }

    public void setGroupName(String groupName) {
        this.name = groupName;
    }

}
