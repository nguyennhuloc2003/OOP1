package Controller;

import view.Menu;

public class Manager extends Menu<String> {
    static String[] options = {"Add Student, Teacher",
            "updateTeacher",
            "deleteTeacher",
            "searchByNameOrID",
            "displayTotalSalary",
            "sortStudentsByName",
            "sortTeachersByName",
            "searchByNameOrID",
            "sortStudentsByName",
            "Exit"};
    Algorithm a=new Algorithm();
    public Manager() {
        super("schoolmanager", options);
    } 
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> a.insertTeacher();
            case 2 -> a.updateTeacher();
            case 3 -> a.deleteTeacher();
            case 4 -> a.searchByNameOrID();
            case 5 -> a.displayTotalSalary();
            case 6 -> a.sortStudentsByName();
            case 7 -> a.sortTeachersByName();
            case 8 -> a.searchByNameOrID();
            case 9 -> a.sortStudentsByName();
            case 10 -> System.exit(0);
        }
                
    }
  
}
