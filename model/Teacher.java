package model;

public class Teacher extends Person{
    
    private double salary;
    private int workday;

    public Teacher(double salary, int workday, String ID, String name, String phone, String address) {
        super(ID, name, phone, address);
        this.salary = salary;
        this.workday = workday;
    }

    public double getSalary() {
        return workday * 800000;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    @Override
    public String toString() {
        return "Teacher{"  + super.toString() + "salary=" + salary + ", workday=" + workday + '}';
    }
   
    
}
