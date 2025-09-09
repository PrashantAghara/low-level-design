package dp.proxy;

public interface EmployeeDao {
    void getEmployeeInfo();

    void createEmployee();

    void deleteEmployee();

    void updateSalary(double newSalary);

    void displayEmployeeDetails();
}
