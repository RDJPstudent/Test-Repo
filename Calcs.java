
public class Calcs
{
    public static void main(String[] args)
    {
        double a = 5;
        double b = 3;
        double c;

        c = addition(a,b);
        System.out.println("The numbers are a=" +a+ " and b=" +b+ "which equals" +c);
        c = subtraction(a,b);
        System.out.println("The numbers are a=" +a+ " and b=" +b+ "which equals" +c);
        c = multiplication(a,b);
        System.out.println("The numbers are a=" +a+ " and b=" +b+ "which equals" +c);
        c = division(a,b);
        System.out.println("The numbers are a=" +a+ " and b=" +b+ "which equals" +c);
        c = power(a,b);
        System.out.println("The numbers are a=" +a+ " and b=" +b+ "which equals" +c);
    }

    public static double addition(double a,double b)
    {
        return(a+b);
    }

    public static double subtraction(double a, double b)
    {
        return(a-b);
    }

    public static double multiplication(double a, double b)
    {
        return(a*b);
    }

    public static double division(double a, double b)
    {
        return(a/b);
    }

    public static double power(double a, double b)
    {
        return(Math.pow(a,b));
    }
}