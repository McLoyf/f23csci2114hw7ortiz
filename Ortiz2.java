//4613732
public class Ortiz2 {
    public static void main(String[] args) {
        long n = 50;
        fibonacci(n);
    }

    static void fibonacci(long iter) {
        long evenCount = 0;
        long num1 = 0;
        long num2 = 1;
        for (int i = 0; i < iter; i++) {
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            if ((num3 % 2) == 0 && num3 < 4000000) {
                evenCount += num3;
            }
        }
        System.out.println(evenCount);
    }
}