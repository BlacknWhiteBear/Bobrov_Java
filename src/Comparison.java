import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner twoValuesObj = new Scanner(System.in);
        System.out.println("Введите два целых числа, разделённые пробелом:");

        // User enters values a and b as a string, then program assigns each value to its corresponding variable
        try {
            String a_and_b = twoValuesObj.nextLine().trim();
            String[] twoValues = a_and_b.split("\\s+");

            if (twoValues.length == 2) {
                int num_a = Integer.parseInt(twoValues[0]);
                int num_b = Integer.parseInt(twoValues[1]);

        // Program compares values a and b, then prints the comparison result
                switch (Integer.compare(num_a, num_b)) {
                    case 1:
                        System.out.println("Результат сравнения: " + num_a + " > " + num_b + ";");
                        break;
                    case -1:
                        System.out.println("Результат сравнения: " + num_a + " < " + num_b + ";");
                        break;
                    default:
                        System.out.println("Результат сравнения: " + num_a + " = " + num_b + ";");
                }

        // Program performs basic arithmetic operations with values a and b */
                System.out.println("Результат сложения: " + (num_a + num_b) + ";");
                System.out.println("Результат вычитания: " + (num_a - num_b) + ";");
                System.out.println("Результат умножения: " + (num_a * num_b) + ";");

        // Program checks if b isn't 0 to be able to perform division */
                if (num_b == 0) {
                    System.out.println("Операция деления невозможна.");
                } else {
                    System.out.println("Результат деления: " + ((double) num_a / (double) num_b) + ".");
                }

        // Program tells user about wrong input style
            } else {
                System.out.println("Ошибка: ввод должен содержать два целых числа, разделённые пробелом.");
            }
        }  catch (NumberFormatException e) {
            System.out.println("Ошибка: ввод должен содержать два целых числа, разделённые пробелом.");
        }
    }
}