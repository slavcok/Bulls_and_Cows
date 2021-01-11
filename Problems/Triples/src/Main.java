import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        Integer[] c = new Integer[n];
        int pom = 0;
        for (int i = 0; i < n; ++i) {
            c[i] = scanner.nextInt();
        }
        
        for (int j = 0; j < n - 2; ++j) {
            if ((c[j + 1] - 1) == (c[j])  && (c[j + 2] - 2) == (c[j])) {
                pom = pom + 1;
            }
        }
        System.out.print(pom);
        
    }
}
