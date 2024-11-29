//906609
public class Ortiz4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int factor1 = 100;
        int factor2 = 100;

        for (int num1 = 100; num1 <= 999; num1++) {
            for (int num2 = 100; num2 <= 999; num2++) {
                int product = num1 * num2;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                    factor1 = num1;
                    factor2 = num2;
                }
            }
        }
        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(int number) {
        String str = 
        nt left = 0;
         int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
