package Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        int insertPos = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos++] = num;
            }
        }
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
