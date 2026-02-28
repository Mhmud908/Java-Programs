public class LargestNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {5,2,9, 1, 7};

        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++){

            for(int j = 0; j<numbers.length; j++){
                if(numbers[i] > numbers[j] && i != j){

                    largest = numbers[i]
                }
            }
        }

        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++){
                if(numbers[i] > largest){
                    largest = numbers[i]
                }
            }
        }

        
    }
}
