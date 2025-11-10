import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[]args) {
        double[] array = new double[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            array[i] = readDouble(sc, "Enter the value of item " + (i + 1) + ": ");
        }

        System.out.println("\n You entered: " + Arrays.toString(array));

        double sum = 0, min = array[0], max = array[0];
        for (double v : array) {
            sum += v;
            if (v < min) min = v;
            if (v > max) max = v;
        }

        double avg = sum / array.length;

        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static double readDouble(Scanner sc, String prompt) {
        while(true) {
            System.out.print(prompt);
            String s = sc.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Not a vlid number, try again.");
            }
        }
    }
}