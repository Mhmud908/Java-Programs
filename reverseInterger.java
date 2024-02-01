import java.util.ArrayList;
public class reverseInterger {
    
    public static void main(String agrs[]){

        int num=123456789;
        ArrayList<Integer> arr= new ArrayList<>();
        while (num>0) {
            arr.add(num%10);
            num/=10;
        }
        System.out.println("Reversed Integer");
        for(int i=0 ;i<arr.size(); i++){
            System.out.print(arr.get(i));
        }

    }
}
