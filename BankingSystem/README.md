public class LargestNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {5,2,9, 1, 7};

        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++){
                if(numbers[i] > largest){
                    largest = numbers[i]
                }
            }


        int largest = numbers[0];
        int secondLargest = numbers[1];

        for(int i=0; i<numbers.length; i++){

                if(numbers[i] > largest > secondLargest){
                    largest = numbers[i]
                }
            }


        int largest = numbers[0];
        int secondLargest = numbers[1];

        for(int i=0; i<numbers.length; i++){

                if(numbers[i] > largest){
                    if(largest > secondLargest){
                    largest = numbers[i]
                    }else{
                        largest = second
                    }
                }
            }
        }



        }

        
    }
}
