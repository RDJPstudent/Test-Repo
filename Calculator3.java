// class object = space function
// chair cl = new chair()

//FUNCTION TALK
/* main is a function
 * main sub routine / method/ function
 * Functions don't exist until you create them.
 * The function can be whatever you can program it to be
 * There are 4 types of functions.
 * Functions change with parameters and returns.
 * 1/4 type is W/O parameter
 * 2/4 type is With parameter
 * 3/4 type is parameter + return
 * 4/4 type is ?
 * 
 * This is Parameter + Return.
 */

 import java.lang.Math;

public class Calculator3
{
    public static void main (String [] args)
    {
        double a = 3;
        double b = 7;
        double c;

        c = addition(a,b);
        System.out.println("The addition of " + a + " and " + b + " equal " + c);
        c = subtraction(a,b);
        System.out.println("The subtraction of " + a + " and " + b + " equal " + c);
        c = multiplication(a,b);
        System.out.println("The multiplication of " + a + " and " + b + " equal " + c);
        c = power(a,b);
        System.out.println("The power of " + a + " and " + b + " equal " + c);
        c = division(a,b);
        System.out.println("The division of " + a + " and " + b + " equal " + c);


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

    public static double power(double a, double b)
    {

        return(Math.pow(a,b));

    }

    public static double division(double a, double b)
    {

        return(a/b);
        
    }
}