import java.util.Scanner;

public class ArrayCube {
    public static void main(String[]args){

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Print the X variable.");
        // double x = sc.nextDouble();

        // System.out.println("Print the X end.");
        // double xEnd = sc.nextDouble();

        // System.out.println("Print the Y variable.");
        // double y = sc.nextDouble();

        // System.out.println("Print the Y end.");
        // double yEnd = sc.nextDouble();

        // System.out.println("Print the Z variable.");
        // double z = sc.nextDouble();

        // System.out.println("Print the Z end.");
        // double zEnd = sc.nextDouble();   
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X size: ");
        int xSize = scan.nextInt();

        System.out.println("Enter y size: ");
        int ySize = scan.nextInt();

        System.out.println("Enter Z size: ");
        int zSize = scan.nextInt();

        Integer[][][] cube = new Integer[xSize][ySize][zSize];

         for (int i = 0; i< xSize; i++) {
             for (int j = 0; j < ySize; j++) {
                    for (int d = 0; d < zSize; d++) {
                        cube[i][j][d] = (i + 1) * (j + 1) * (d + 1);
                    }
                  System.out.print((i+1) * (j+1) + " ");
              }
              System.out.println(" ");
         }

         for(int i = 0; i< xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int d = 0; d < zSize; d++) {
                    System.out.print(cube[i][j][d] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
         }

    scan.close();
}
}
