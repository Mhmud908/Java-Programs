package Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        int insertPos = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos] = num;
                insertPos++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
