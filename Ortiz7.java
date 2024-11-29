//104743
public class Ortiz7 {
    public static void main(String[] args) {
        int targetPrimeIndex = 10001;
        int n = 200000;

        int foundPrime = findNthPrime(targetPrimeIndex, n);
        System.out.println(foundPrime);
    }

    public static int findNthPrime(int targetIndex, int initialN) {
        int n = initialN;
        while (true) {
            boolean[] prime = new boolean[n + 1];
            for (int i = 0; i <= n; i++) {
                prime[i] = true;
            }
            for (int p = 2; p * p <= n; p++) {
                if (prime[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        prime[i] = false;
                    }
                }
            }
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (prime[i]) {
                    count++;
                    if (count == targetIndex) {
                        return i;
                    }
                }
            }
        }
    }
}