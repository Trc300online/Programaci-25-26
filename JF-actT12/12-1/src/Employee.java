public class Employee implements Printable {
    protected static int employeeIDCounter = 0;
    private String name;
    private String jobTitle;
    private int employeeId;
    private int level;

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public  void setLevel(int level) {
        this.level = level;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getLevel() {
        return level;
    }

    public void calculateEmployeeID() {
        employeeIDCounter++;
        setEmployeeId(employeeIDCounter);
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Level: " + getLevel());
    }
}
