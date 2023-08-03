package controller;

import view.Menu;

public class Manager extends Menu<String> {
    static String[] options = {"insertTeacher",
            "insertStudent",
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
            case 2 -> a.insertStudent();
            case 3 -> a.updateTeacher();
            case 4 -> a.deleteTeacher();
            case 5 -> a.searchByNameOrID();
            case 6 -> a.displayTotalSalary();
            case 7 -> a.sortStudentsByName();
            case 8 -> a.sortTeachersByName();
            case 9 -> a.searchByNameOrID();
            case 10 -> a.sortStudentsByName();
            case 11 -> System.exit(0);
        }
                
    }
  
}
