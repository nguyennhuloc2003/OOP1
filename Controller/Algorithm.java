package Controller;

import Model.Person;
import Model.Student;
import Model.Teacher;
import common.Validation;
import java.util.ArrayList;
import java.util.Collections;


public class Algorithm extends ArrayList <Person> {
    Validation valid = new Validation();
    
    public void insertTeacher(){
        String ID = valid.inputString("Enter ID: ");
        String name = valid.inputString("Enter name: ");
        String phone = valid.inputString("Enter phone: ");
        String address = valid.inputString("Enter address: ");       
        int wd = Integer.parseInt(valid.inputInt("Enter workday: "));
        Teacher t = new Teacher(-1, wd, ID, name, phone, address);
        this.add(t); 
    } 
    
    public void insertStudent(){
        String ID = valid.inputString("Enter ID: ");
        String name = valid.inputString("Enter name: ");
        String phone = valid.inputString("Enter phone: ");
        String address = valid.inputString("Enter address: ");
        double mark1 = Double.parseDouble(valid.InputDouble("Enter mark1: "));
        double mark2 = Double.parseDouble(valid.InputDouble("Enter mark2: "));
        Student s = new Student(name, mark1, mark2, -1, ID, name, phone, address);
        this.add(s);
    }
    


    public void displayStudents() {
        System.out.println("======= List of Students =======");
        for (Person person : this) {
            if (person instanceof Student student) {
                System.out.println("ID: " + student.getID());
                System.out.println("Name: " + student.getName());
                System.out.println("Phone: " + student.getPhone());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Batch: " + student.getBatch());
                System.out.println("Mark1: " + student.getMark1());
                System.out.println("Mark2: " + student.getMark2());
                System.out.println("===============================");
            }
        }
    }
        
   
    public void displayTeachers() {
        System.out.println("======= List of Teachers =======");
        for (Person person : this) {
            if (person instanceof Teacher teacher) {
                System.out.println("ID: " + teacher.getID());
                System.out.println("Name: " + teacher.getName());
                System.out.println("Phone: " + teacher.getPhone());
                System.out.println("Address: " + teacher.getAddress());
                System.out.println("Salary: " + teacher.getSalary());
                System.out.println("Number of Work Days: " + teacher.getWorkday());
                System.out.println("===============================");
            }
        }
    }
    
   
    
     public void searchByNameOrID() {
        String searchString = valid.inputString("Enter name or ID to search: ");
        boolean found = false;

        System.out.println("======= Search Results =======");
        for (Person person : this) {
            if (person.getName().equalsIgnoreCase(searchString) || person.getID().equalsIgnoreCase(searchString)) {
                System.out.println("ID: " + person.getID());
                System.out.println("Name: " + person.getName());
                System.out.println("Phone: " + person.getPhone());
                System.out.println("Address: " + person.getAddress());
                switch (person) {
                    case Student student -> {
                        System.out.println("Batch: " + student.getBatch());
                        System.out.println("Mark1: " + student.getMark1());
                        System.out.println("Mark2: " + student.getMark2());
                    }
                    case Teacher teacher -> {
                        System.out.println("Salary: " + teacher.getSalary());
                        System.out.println("Number of Work Days: " + teacher.getWorkday());
                    }
                    default -> {
                    }
                }
                System.out.println("===============================");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching results found.");
        }
    }
     
    
    
    public void sortStudentsByName() {
        Collections.sort(this, (Person p1, Person p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }
    
    public void sortTeachersByName() {
        Collections.sort(this, (Person p1, Person p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }

    
    
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Person person : this) {
            if (person instanceof Teacher teacher) {
                totalSalary += teacher.getSalary();
            }
        }
        return totalSalary;
    }
    
    
    public void displayTotalSalary() {
        double totalSalary = calculateTotalSalary();
        System.out.println("Họ và Tên : ==== Lương =====");
        for (Person person : this) {
            if (person instanceof Teacher teacher) {
                System.out.printf("%-20s : %-10.2f VND\n", teacher.getName(), teacher.getSalary());
            }
        }
        System.out.println("Tổng lương cần trả: " + totalSalary + " VND");
    }

    void updateTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}