public class Functions
{
    public static void main (String [] args)
    {
        double x = 3;
        double y = 5;

        addFunction();          // no parameters, no return
        subFunction(x,y);       // parameters, no return

        double result = multiFunction(x,y);     // parameters, with return
        System.out.println(result);
    }

    //No parameters, no return
    static void addFunction()
    {
        double a = 7;
        double b = 9;
        System.out.println((a+b));
    }

    //with parameters, no return
    static double subFunction(double x, double y)
    {
        System.out.println(x-y);
    }

    //with parameters, with return
    static double multiFunction(double x, double y)
    {
        return(x*y);       //return -> feeds into other code
    }                      //println -> feeds into person
}