package Arrays;
public class reverseArray2 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int n = arr.length;

        System.out.println(" Before Reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            n--;

        }
        System.out.println(" After Reversing: ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
