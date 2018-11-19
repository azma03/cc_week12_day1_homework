package staff.management;

import staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String name, String NInumber, double salary, String deptName) {
        super(name, NInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
