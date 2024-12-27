
public class Even_numbers {
    public static void main(String[] args){
        int[] allNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
           for (int i = 1; i <= allNumbers.length; i++) {
               if (i %2 == 0) {
                   System.out.print(i + " ");
               }
           }
    System.out.print(".");
    }
}
