import java.util.Scanner;


class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        StringBuilder string = new StringBuilder();
        for (String s : strings) {
            string.append(s);




        }
        return string.toString().replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
