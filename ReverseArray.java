


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr  = {8, 1000, 77, 69, 96};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Reverse order:" + arr[i]);
        }
    }
}