import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* You are given three numbers: n , a and b.
Your task is to output the sum of the first n random numbers in a range from a to b inclusively.
The seed of the generator should be set as a + b.
The input contains numbers in a single line in the following order: n, a, b. */
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int pom = 0;
        int upper = 0;
        int lower = 0;
        if (a < b) {
            upper = b;
            lower = a;
        } else {
            upper = a;
            lower = b; 
        }
        Random random = new Random(a + b);
        for (int i = 0; i < n; i++)  {
            pom = pom + random.nextInt((upper - lower) + 1) + lower;
        }
        System.out.print(pom);
    }
}
