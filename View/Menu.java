package view;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu <T> {
    protected String title;
    protected ArrayList<T> mChoice;
    Scanner scanner = new Scanner(System.in);
    public Menu(){

    }
    public Menu(String title, String[] mChoice){
        this.title = title;
        this.mChoice = new ArrayList<>();
        for (String str : mChoice) {
            this.mChoice.add( (T) str);
        }
    }
    public void display() {
        System.out.println(title);
        System.out.println("-------------------------------");
        for(int i = 0; i < mChoice.size(); i++){
            System.out.println((i+1) + ". " + mChoice.get(i));
        }
        System.out.println("-------------------------------");
    }

    public int getChoice(){
        display();
        System.out.println("Enter your choice : ");
        return scanner.nextInt();
    }
    public abstract void execute(int n);
    public void run() {
        
        while(true){
            int n = getChoice();
            execute(n);
            if(n > mChoice.size() - 1){
                break;
            }else if(n == mChoice.size() ){
                return;
        }
        
    
    }
    }

    
    

}