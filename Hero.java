import java.util.Scanner;

public class Hero{
    private String HeroR;
    private double HeroT;

    public Hero(String HeroR, double HeroT) {
        this.HeroR = HeroR;
        this.HeroT = HeroT;
    }

    public String getHeroR() { return HeroR; }
    public double getHeroT() { return HeroT; }
    public void setHeroR(String HeroR){this.HeroR = HeroR;}
    public void setHeroT(double HeroT){this.HeroT = HeroT;}

    @Override public String toString() {
        return "Hero{HeroR='" + HeroR + "', HeroT=" + HeroT + "}";
    }

    //Keep I/O outside the data object
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String r = readNonBlankLine(sc, "Enter HeroR (text): ");
            double t = readDouble(sc, "Enter HeroT (number): ");

            Hero h = new Hero(r, t);

            final double TARGET = 69.0;
            final double EPS = 1e-9; //<- correct scientific notation

            if (Math.abs(h.getHeroT() - TARGET) < EPS) {
                System.out.println(h.getHeroR() + " -- " + h.getHeroT() + " 69 lol");
            } else {
                System.out.println(h.getHeroR() + " -- " + (h.getHeroT() * h.getHeroT()));
            }
        }
    }

    private static String readNonBlankLine(Scanner sc, String prompt) {
        while (true) { 
            System.out.print(prompt);
            String s = sc.nextLine();
            if (s != null && !s.isBlank()) return s.trim();
            System.out.println("Input cannot be blank. Try Again.");
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) { 
            System.out.print(prompt);
            String s = sc.nextLine();
            try { return Double.parseDouble(s.trim()); }
            catch (NumberFormatException e) { System.out.println("Not a number, try again.");
        }
        }
    }
}