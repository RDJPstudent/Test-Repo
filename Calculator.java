public class Calculator
{
    public static void main(String[]args)
    {
    
        double a = 3;
        double b = 5;
        double c = 7;
        double da = (a + b);
        double ds = (b - c);
        double dm = (b * c);
        double dd = (c / a);
        double dp = Math.pow(a, c);

        System.out.println("Addition of" + a + "and" + b + "is: " + da);
        System.out.println("Subtraction of" + b + "and" + c + "is: " + ds);
        System.out.println("Multiplication of" + b + "and" + c + "is: " + dm);
        System.out.println("Division of" + c + "and" + a + "is: " + dd);
        System.out.println("Power of" + a + "and" + c + "is: " + dp);
    }
}