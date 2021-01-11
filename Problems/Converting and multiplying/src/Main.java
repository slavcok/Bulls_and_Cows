import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            String s = scanner.next();
            if ("0".equals(s)) {
                break;
            }
            int i = 0;
            try {
                i = (Integer.parseInt(s));

            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }
            if ( i != 0){
                System.out.println(i * 10);
            }
        }
    }
}
