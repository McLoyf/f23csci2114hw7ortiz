//142913828922
public class Ortiz10 {
    public static void main(String[] args) {
        int n = 2000000;
        long sum = sieveOfEratosthenes(n);
        System.out.println(sum);
    }

    public static long sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sum += i;
            }
        }

        return sum;
    }
}