package staff;

public class Employee {

    protected String name;
    protected String NInumber;
    protected double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != ""){
            this.name = name;
        }
    }

    public void setNInumber(String NInumber) {
        this.NInumber = NInumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment){
        if(increment > 0){  //prevent negative value
            this.salary += increment;
        }
    }

    public double payBonus(){
        return (1.0/100) * this.salary;
    }
}
