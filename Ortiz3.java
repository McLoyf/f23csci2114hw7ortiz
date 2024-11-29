
//6857
import java.math.BigInteger;

public class Ortiz3 {
    public static void main(String[] args) {
        findPrimeFactor();
    }

    public static void findPrimeFactor() {
        BigInteger primeNum = new BigInteger("600851475143");
        BigInteger i = BigInteger.valueOf(2);

        while (primeNum.compareTo(BigInteger.ONE) > 0) {
            if (primeNum.mod(i).equals(BigInteger.ZERO)) {
                primeNum = primeNum.divide(i);
            } else {
                i = i.add(BigInteger.ONE);
            }
        }
        System.out.println(i);
    }
}