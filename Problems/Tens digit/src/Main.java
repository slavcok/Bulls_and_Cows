import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer first = scanner.nextInt();
        // (n % 100) / 10;
        int tens = (first % 100) / 10;
        System.out.println(tens);
    }
}
