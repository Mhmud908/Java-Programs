import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        System.out.println("\n\n");
        System.out.println("\t\t\t|");
        System.out.println("\t \t     .  .  .");
        System.out.println("\t\t     *.* *.*");

        System.out.println("\n\n");
        char s = '*';
        for(int i=1;i<=10;++i){
            for(int j=1;j<=6;++j){
                if(j==1){
                for(int g=1;g<=1;++g){
                System.out.print("\t");
                if(i>=6)
                System.out.print(s);}
                System.out.print("\t");}
            System.out.print(s);
               if (j%2==1){
                System.out.print("\t");
               }
                }
            System.out.print("\n");

        }
        System.out.print("   \t *.___.* *.___.*  *.__.* \t*");
        System.out.println("\n\n\n");
    }
}















        /*for(int k = 1;k<=19;++k){
            System.out.print("*");
            switch(k){
                case 7:
                System.out.print("");
                case 13:
                case 21:
            System.out.print("  ");
            }
            if(k==19){
                System.out.print("  \t*");
            }
        }*/