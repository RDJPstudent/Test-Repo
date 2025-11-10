import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int p = 0; p < numbers.length; p++) {
            System.out.print("Enter a number " + ( p ) + ": ");
            numbers[p] = sc.nextInt();
        }

        System.out.println("You entered: ");
        for (int p = 0; p < numbers.length; p++) {
            System.out.println("Numbers[" + p + "] = " + numbers[p]);
        }
    }
}