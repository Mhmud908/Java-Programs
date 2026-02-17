public class TypingSimulation {

    public static void main(String[] args) throws InterruptedException {
        char[] chars = new char[226];
        int indexA = 30;
        String word = "Jaaduii!";

        // Create a list of alpha nums with a variety of symbols
        for (int i = 0; i < 226; i++) {
            indexA++;
            chars[i] = (char) indexA;
        }

        // Simulate typing out the word with a delay of 0.01 seconds
        System.out.println("\n");
        for (char i : word.toCharArray()) {
            for (char j : chars) {
                System.out.print(j);
                Thread.sleep(30);
                System.out.print("\b");
                if (j == i) {
                    System.out.print(j);
                    Thread.sleep(30);
                    break;
                }
            }
        }
        System.out.println("\n\n");
    }
}