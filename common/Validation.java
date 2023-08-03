package common;
    


import model.Person;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Validation {
    private final Pattern patternDouble = Pattern.compile("^[0-9]+\\.?[0-9]*$"); 
    private final Pattern patternInt = Pattern.compile("^\\d+$");
    private final static Scanner r = new Scanner(System.in);

    //===========================================
    
    public String checkID(ArrayList<Person> person, String test){
        Boolean t = true;   
        test = checkInputString(test);
        String ID = test;
        for(Person ps : person){
            if(test.equalsIgnoreCase(ps.getID())){
                t = false;}
        }
        if (!t) {
            System.out.println("Duplicated ID ");
            System.out.println("Enter again : ");
            ID = r.nextLine();
            return checkID(person,ID);
        }
        return ID;
    }
    
    //===========================================
    
    public boolean checkIDExist(ArrayList<Person> Person, String test){  
        test = checkInputString(test);
        for(Person wk : Person){
            if(test.equalsIgnoreCase(wk.getID())){
                return true;
            }
        }

        return false;
    }
    
    //===========================================
    
    public boolean checkYN(String promt){
        while(true){
            System.out.print(promt);
            String test = r.nextLine();
            test = checkInputString(test);
            if(test.equalsIgnoreCase("Y")){
                return true;
            } else if (test.equalsIgnoreCase("N")){
                return false;
            }
            return checkYN("Please enter Y (YES) or N (NO): ");
        }
    }

    //===========================================
    
    public String inputInt(String promt){
        System.out.print(promt);
        String s = r.nextLine();         
        s = checkInputString(s);
        if (!checkInt(s)){
            return inputInt("Enter a digit: ");
        }
        return s;
    }
    //===========================================
    
    public String inputString(String promt){       
        System.out.print(promt);
        String s = r.nextLine();
        s = checkInputString(s);
        return s;
    }
    
    //===========================================
    
    public String checkInputString(String test){
        String t = test;
            if (test.isEmpty()) {
                System.out.print("Enter again (not a blank): ");
                t = r.nextLine();
                return checkInputString(t);
            }
            return t;
        
    }
    
    //===========================================
    
    public int inputIntGreaterThan(String promt, int n){
        int a;
        while (true){
            System.out.print(promt + " (x => "+ n + "): ");
            try{
                String s = r.nextLine();
                a = Integer.parseInt(s);
                if (a >= n){
                    break;
                }
        } catch(NumberFormatException e){
                System.out.println("Enter again (x => " + n + "): ");
        }
        }
        return a;
    }
    
    //===========================================
    
    public int inputInRange(String promt, int n, int m){
        int a;
        while (true){
            System.out.print(promt + " (" + n + " <= x <= "+ m + "): ");
            try{
                String s = r.nextLine();
                a = Integer.parseInt(s);
                if (a <= m && a >= n){
                    break;
                }
        } catch(NumberFormatException e){
                System.out.println("Enter again (" + n + " <= x <= "+ m + "): ");
        }
        }
        return a;
    }
    
    //===========================================
    
    public void PrintTitle(){
       System.out.printf("|%4s|%10s|%3s|%8s|%6s|%21s|\n","ID",
               "Name",
               "Age",
               "Salary",
               "Status",
               "Date"); 
    }
    
    //===========================================
    
    public void PrintBottom(){
        
        System.out.println("=".repeat(59));
    }
    //===========================================
    
    public boolean checkInt (String test){
        Matcher matcher = patternInt.matcher(test);
        return matcher.matches();
    }
    public boolean checkDouble (String test){
        Matcher matcher = patternDouble.matcher(test);
        return matcher.matches();
    }
  public String InputDouble(String promt){
        System.out.print(promt);
        String s = r.nextLine();         
        s = checkInputString(s);
        if (!checkDouble(s)){
            return InputDouble("Enter a digit: ");
        }
        return s;
    }
}