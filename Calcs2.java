public class Calcs2
{
    public static void main (String[] args)
    {
        double a = 3;
        double b = 4;
        double c;

        c = addition(a,b);
        System.out.println("A = " +a+ "and B = " +b+ " to create C = " + c);

        c = subtraction(a,b);
        System.out.println("A = " +a+ "and B = " +b+ " to create C = " + c);

        c = multiplication(a,b);
        System.out.println("A = " +a+ "and B = " +b+ " to create C = " + c);

        c = division(a,b);
        System.out.println("A = " +a+ "and B = " +b+ " to create C = " + c);
        
        c = power(a,b);
        System.out.println("A = " +a+ "and B = " +b+ " to create C = " + c);
    }

    public static double addition(double a, double b)
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
        return (a/b);
    }
    
    public static double power(double a, double b)
    {
        return(Math.pow(a,b));
    }
}