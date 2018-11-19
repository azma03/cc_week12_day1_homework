package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NInumber, double salary, String deptName, int budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return (2.0/100) * super.salary;
    }
}
