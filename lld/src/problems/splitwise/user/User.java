package problems.splitwise.user;

import problems.splitwise.balance.BalanceSheet;

public class User {
    String id;
    String name;
    BalanceSheet sheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.sheet = new BalanceSheet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BalanceSheet getSheet() {
        return sheet;
    }

    public void setSheet(BalanceSheet sheet) {
        this.sheet = sheet;
    }
}
