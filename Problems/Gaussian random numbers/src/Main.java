import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //For the given numbers K, N, and M find the first seed that is
        // greater or equal to K where each of N Gaussian numbers is less than or equal to M.
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        double pom = 1d;
        Random random = new Random(k);
        random.setSeed(k);
        for (int i = 0; i < n; i++)  {
            pom = random.nextGaussian() ;
            if (pom <= m) {
                System.out.print(pom + " ") ;
                } else  { random.nextGaussian(); i =0; }
        }     
    }
}
