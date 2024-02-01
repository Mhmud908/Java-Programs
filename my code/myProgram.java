
import java.util.*;

import javax.xml.transform.Source;


class Menu {
  public static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
    public static void main(String[] args){

      int arr[]={1,2,3,4,5,6,7};

      for(int i=0;i<7;i++){
        int k=3;
        for(int j=0;j<k;j++){
        int temp=arr[i+1];
        arr[i+1]=arr[7-1];
        arr[7-1]=temp;

        }
        System.out.print(arr);
      }
      printarray(arr);

      }
      
}