import java.util.Scanner;

public class Zed {
    private String zedR;
    private double zedT;

    //Default Constructor
    public Zed() {}

    //Parameterized constructor
    public Zed(String zedR, double zedT) {
        this.zedR = zedR;
        this.zedT = zedT;
    }

    public String getZedR() {
        return zedR;
    }

    public void setZedR(String zedR) {
        this.zedR = zedR;
    }

    public double getZedT() {
        return zedT;
    }

    public void setZedT(double zedT) {
        this.zedT = zedT;
    }

    @Override
    public String toString() {
        return "zed{zedR='" + zedR + "', zedT=" + zedT + "}";}

    private static boolean equalsDouble(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }

    private static double readDoubleLine(Scanner sc, String prompt) {
    while (true) { 
        System.out.print(prompt);
        String s = sc.nextLine();
        try {
            return Double.parseDouble(s.trim());
        } catch (NumberFormatException e) {
                System.out.println("invalid number, try again.");
        }
    }
    }

    private static String readNonBlankLin(Scanner sc, String prompt) {
        while (true) { 
            System.out.print(prompt);
            String s = sc.nextLine();
            if (s != null && !s.isBlank()) return s;
            System.out.println("Input cannot be blank, try again.");
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //Read as lines to avoid the nextDouble()/nextLine()
        //newline trap
        String zedR = readNonBlankLin(sc, "Enter zedR (text): ");
        double zedT = readDoubleLine(sc, "Enter zedT (number): ");

        Zed newZed = new Zed(zedR, zedT);

        //Safer double check with tolerance
        final double TARGET = 69.0;
        final double EPS = 1e-9;

        if (Math.abs(newZed.getZedT() - TARGET) < EPS) {
                System.out.println(newZed.getZedR() + " " + newZed.getZedT() + " 69 lol");
            } else {
                System.out.println(newZed.getZedR() + " " + (newZed.getZedT() * newZed.getZedT()));
            }
    }
}