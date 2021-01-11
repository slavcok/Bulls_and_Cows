package bullscows;

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static String randomGenerator(int length, int symbols) {
        List<Character> list = new ArrayList<>(List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
                'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u',
                'v',  'w',  'x', 'y', 'z'));
        List<Character> randomList = list.subList(0, symbols);
        Collections.shuffle(randomList);
        StringBuilder result = new StringBuilder();
        for (var ch : randomList.subList(0, length)) {
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean calculateScore(String guess, String code, int length) {
        int bulls = 0;
        int cows = 0;
        int i = 0;
        for (char ch : guess.toCharArray()) {
            if (code.indexOf(ch) != -1) {
                if (code.charAt(i) == ch) {
                    bulls++;
                } else {
                    cows++;
                }
            }
            i++;
        }
        if (bulls > 0 && cows > 0) {
            System.out.printf("Grade: %d bull(s) and %d cow(s)\n", bulls, cows);
        } else if (bulls > 0) {
            System.out.printf("Grade: %d bull(s)\n", bulls);
        } else if (cows > 0) {
            System.out.printf("Grade: %d cow(s)\n", cows);
        } else {
            System.out.print("Grade: None\n");
        }
        return bulls == length;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter the secret code's length:");
        String lengths = sc.nextLine();
    //    sc.nextLine();
        if ( lengths== null) {
            System.out.println("error");
            System.exit(0);
        }
        for (char c : lengths.toCharArray()) {
            if (c < '0' || c > '9') {
                System.out.println("error");
                System.exit(0);
            }
        }
        int length = Integer.parseInt(lengths);
        System.out.println("Input the number of possible symbols in the code:");
        int symbols = sc.nextInt();
        sc.nextLine();

        if (length > symbols ) {
            System.out.println("Error: it's not possible to generate a code with a length of " + lengths +" with " + symbols +  " unique symbols.");
            System.exit(0);
        }
        if (length <= 0 || length > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }
        if (symbols <= 0 || symbols > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }
        String code = randomGenerator(length, symbols);
        System.out.printf("The secret is prepared: %s ", "*".repeat(length));
        if (symbols <= 10) {
            System.out.printf("(0-%d).\n", symbols - 1);
        } else {
            System.out.printf("(0-9, a-%s).\n", "abcdefghijklmnopqrstuvwxyz".charAt(symbols - 11));
        }
        System.out.println("Okay, let's start a game!");
        int i = 1;
        while (true) {
            System.out.println("Turn " + i + ":");
            String guess = sc.nextLine();
            if (calculateScore(guess, code, length)) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
            i++;
        }
    }
}