package Arrays;

public class PractRough {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int k = 6;

        System.out.println("K = " + k);

        k = k % arr.length;
        System.out.println("K after modulo = " + k);

    }
    
}
