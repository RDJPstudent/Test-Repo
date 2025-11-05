// class object = space function
// chair cl = new chair()

//FUNCTION TALK
/* main is a function
 * main sub routine / method/ function
 *  Functions don't exist until you create them.
 * The function can be whatever you can program it to be
 * There are 4 types of functions.
 * Functions change with parameters and returns.
 * 1/4 type is W/O parameter
 * 2/4 type is With parameter
 * 3/4 type is parameter + return
 * 4/4 type is ?
 */

 import java.lang.Math;

public class Calculator2
{
    public static void main (String [] args)
    {
        double a = 3;
        double b = 7;

        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        power(a,b);
        division(a,b);


    }

    public static void addition(double a, double b)
    {

        System.out.println("The addition of " + a + " and " + b + " equal " + (a+b));

    }

    public static void subtraction(double a, double b)
    {

        System.out.println("The subtraction of " + a + " and " + b + " equal " + (a-b));
    }


    public static void multiplication(double a, double b)
    {

        System.out.println("The multiplcation of " + a + " and " + b + " equal " + (a*b));
    }

    public static void power(double a, double b)
    {

        double c = Math.pow(a, b);
        System.out.println("The power of " + a + " by " + b + " equals " + c);
    }

        public static void division(double a, double b)
    {

        System.out.println("The division of " + a + " by " + b + " equals " + (a/b));
    }
}