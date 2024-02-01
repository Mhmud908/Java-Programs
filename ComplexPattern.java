import java.util.*;
public class ComplexPattern {

    public static void pArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        System.out.print("Explaination");

     for(int i=0; i<k; i++){
        for(int j=0; j<arr.length-1; j++){

            int temp=arr[arr.length-1-j];
            arr[arr.length-1-j] =arr[arr.length-2-j];
            arr[arr.length-2-j] =temp;

        }
        System.out.println();
        pArray(arr);


     }
     
     
    }
}