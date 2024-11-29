//25164150
public class Ortiz6 {
    public static void main(String[] args) {
        int n = 100;
        sumSquares(n);
    }

    static void sumSquares(int inter) {
        int runningSum = 0;
        int squareSum = 0;
        for (int i = 1; i <= inter; i++) {
            double sum = Math.pow(i, 2);
            runningSum += sum;
        }
        for (int j = 1; j <= inter; j++) {
            squareSum += j;
        }
        double squareOfSum = Math.pow(squareSum, 2);
        System.out.printf("%.0f%n", squareOfSum - runningSum);
    }
}