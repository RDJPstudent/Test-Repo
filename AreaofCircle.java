public class AreaofCircle {

    public static void main(String[] args) {
        AreaofCircle();
    }

    public static void AreaofCircle() {
        double A;
        double r = 5;
        A = Math.PI * Math.pow(r,2);
        System.out.print(A);
    }
}

//End of first code.


public class CalcAreaOfCircle{
    public static void main(String[]args){
    double r = 7.00;
    double a = (r * r) + Math.PI;

    System.out.print("The area is" + " " + a);
    }
}

//End of second code

public class AreaofCircle {

    public static void main(String[] args){
        double r = 5;
        double A;
        A = AreaofCircle(r);
        System.out.print(A);
    }

    public static double AreaofCircle(double r){
        double A;
        A = Math.PI * Math.pow(r,2);
        return (A);
    }
}

//End of second code

public class CelciusToFarenheit{

    public static void main(String[] args) {
        double Far;
        double cel = 0;

        Far = (cel * 1.8) + 32.0;

        System.out.print(Far);
    }
}
