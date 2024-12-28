import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        try (Scanner twoLinesObj = new Scanner(System.in)) {

            System.out.println("Введите первую строку:");
            String firstLine = twoLinesObj.nextLine();

            System.out.println("Введите вторую строку:");
            String secondLine = twoLinesObj.nextLine();

            System.out.println(firstLine.equals(secondLine)
                    ? "Строки идентичны."
                    : "Строки неидентичны.");
        }
    }
}
