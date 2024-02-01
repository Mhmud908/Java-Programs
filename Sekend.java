
import java.util.*;
public class Sekend {

    public static void press(char us){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter y to ReRun the program \n Enter n to Exit  ");
        char uc= sc.next().charAt(0);
        if(uc == 'y'){
               press(uc);

        }
        else if(uc=='n'){
            System.out.println("The Program is Exiting \n-------{Thank You}-------");
            return;
        }
        else{
            System.out.println("You Entered an Invalid Character\n{Please Try Again}");
            press(uc);
        }
        sc.close();
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter y to ReRun the program \n Enter n to Exit  ");
        char uc= sc.next().charAt(0);
        if(uc == 'y'){
               press(uc);

        }
        else if(uc=='n'){
            System.out.println("The Program is Exiting \n-------{Thank You}-------");
            return;
        }
        else{
            System.out.println("You Entered an Invalid Character\n{Please Try Again}");
            press(uc);
        }

       sc.close();
    }
    
    
}