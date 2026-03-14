package Arrays;

public class ZerosToStart {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 4, 5};
           System.out.println();
        int insertPos = arr.length-1;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos--;
            }
        }

         for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("InsertPos = " + insertPos);
        for (int i = insertPos; insertPos >= 0; insertPos--){
            arr[i] = 0;
        }

           for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
