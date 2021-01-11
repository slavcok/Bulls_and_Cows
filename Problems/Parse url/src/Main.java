import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        //https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
        String[] parts = w.split("\\?");
        String r = parts[1]; // r = pass=12345&port=8080&cookie=&host=localhost
        String[] parts2 = r.split("&"); //pass=12345 port=8080 cookie= host=localhost
        String pom = "0";
        for (int i = 0; i < parts2.length; i++) {
            String parts3 = parts2[i]; // pass=12345
            String[] parts4 = parts3.split("=");
            System.out.print(parts4[0] + " : ");
            if ("pass".equals(parts4[0])) {
                pom = parts4[1];
            }
            if (parts4.length > 1) {
                System.out.print(parts4[1] + '\n');
            } else {
                System.out.println("not found");
            }

        }
        if (pom !="0") {
            System.out.print("password : ");
            System.out.print(pom);
        }

    }
}