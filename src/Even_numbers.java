
public class Even_numbers {
    public static void main(String[] args){
        int[] allNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean firstEvenFlag = true;
        for (int currentNum : allNumbers) {
            if (currentNum %2 == 0) {
                if (!firstEvenFlag) {
                    System.out.print(", ");
                }
                System.out.print(currentNum);
                firstEvenFlag = false;
            }
        }
        System.out.print(".");
    }
}
