
package Model;


public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;
    private double AverageMark;

    public Student(String batch, double mark1, double mark2, double AverageMark, String ID, String name, String phone, String address) {
        super(ID, name, phone, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.AverageMark = AverageMark;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getAverageMark() {
        return (mark1 + mark2)/2;
    }

    public void setAverageMark(double AverageMark) {
        this.AverageMark = AverageMark;
    }

    @Override
    public String toString() {
        return "Student{" + "batch=" + batch + ", mark1=" + mark1 + ", mark2=" + mark2 + ", AverageMark=" + AverageMark + '}';
    }

}