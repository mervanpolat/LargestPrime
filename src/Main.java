import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        int number = 114;
        primeFactors(number);
    }

    private static void primeFactors(int number) {
        System.out.println("Entered value: " + number);

        HashSet<Integer> hashSet=new LinkedHashSet<>();
        for (int i = 2; i <= number; i++) {
            while (number%i == 0) {
                hashSet.add(i);
                number = number/i;
            }
    }
        int maxSum = 0;
        int sum = 0;
        for (Integer integer : hashSet) {
            System.out.println(integer);
            sum = sum + integer;
            if (integer>maxSum) {
                maxSum = integer;
            }
        }
}

}