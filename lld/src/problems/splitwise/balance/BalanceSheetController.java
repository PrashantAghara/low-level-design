package problems.splitwise.balance;

import problems.splitwise.expense.split.Split;
import problems.splitwise.user.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {
    public void updateUserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount) {
        BalanceSheet paidUserBalanceSheet = expensePaidBy.getSheet();
        paidUserBalanceSheet.setTotalPayment(paidUserBalanceSheet.getTotalPayment() + totalExpenseAmount);
        for (Split split : splits) {
            User user = split.getUser();
            BalanceSheet userOweSheet = user.getSheet();
            double oweAmount = split.getAmount();

            // Balance sheet update of Paid By
            if (expensePaidBy.getId().equals(user.getId())) {
                paidUserBalanceSheet.setTotalYourExpense(paidUserBalanceSheet.getTotalYourExpense() + oweAmount);
            } else {
                paidUserBalanceSheet.setTotalYouGetBack(paidUserBalanceSheet.getTotalYouGetBack() + oweAmount);
                Balance userOweBalance;
                if (paidUserBalanceSheet.getUserVsBalance().containsKey(user.getId())) {
                    userOweBalance = paidUserBalanceSheet.getUserVsBalance().get(user.getId());
                } else {
                    userOweBalance = new Balance();
                    paidUserBalanceSheet.getUserVsBalance().put(user.getId(), userOweBalance);
                }
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);
            }

            // Other user's balance sheet update
            userOweSheet.setTotalYouOwe(userOweSheet.getTotalYouOwe() + oweAmount);
            userOweSheet.setTotalYourExpense(userOweSheet.getTotalYourExpense() + oweAmount);

            Balance userPaidBalance;
            if (userOweSheet.getUserVsBalance().containsKey(expensePaidBy.getId())) {
                userPaidBalance = userOweSheet.getUserVsBalance().get(expensePaidBy.getId());
            } else {
                userPaidBalance = new Balance();
                userOweSheet.getUserVsBalance().put(expensePaidBy.getId(), userPaidBalance);
            }
            userPaidBalance.setAmountGetBack(userPaidBalance.getAmountOwe() + oweAmount);
        }
    }

    public void showBalanceSheetOfUser(User user) {

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getId());

        BalanceSheet userExpenseBalanceSheet = user.getSheet();

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymentMade: " + userExpenseBalanceSheet.getTotalPayment());
        for (Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsBalance().entrySet()) {

            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");

    }

}