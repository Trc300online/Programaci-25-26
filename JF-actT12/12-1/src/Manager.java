import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList employeeList = new ArrayList();

    public void setEmployee(Employee emp) {
        employeeList.add(emp);
    }


    public ArrayList getEmployeeList() {
        return employeeList;
    }

    public void displayInformation() {
        Employee emp;
        super.displayInformation();
        System.out.println("Manager has the following employees:");

        for (Object obj : employeeList) {
            emp = (Employee) obj;
            System.out.println("\t" + emp.getName());
        }
    }
}
