import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] parts = number.split("");
        StringBuilder reverz = new StringBuilder();

        if (!"0".equals(parts[2])) { 
            reverz.append(parts[2]); 
        }
        reverz.append(parts[1]);
        reverz.append(parts[0]);

        System.out.print(reverz);



    }
}
