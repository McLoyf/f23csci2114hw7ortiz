
//232792560
import java.util.Arrays;

public class Ortiz5 {
    public static void main(String[] args) {
        int initialNumber = 2520;
        int[] numbersToCheck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        while (true) {
            boolean isValid = true;
            for (int num : numbersToCheck) {
                if (initialNumber % num != 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(initialNumber);
                break;
            }
            initialNumber++;
        }
    }
}
