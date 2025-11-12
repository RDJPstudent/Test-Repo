//Area of Circle

public class AoC{
    private double Radius;
    private double Area;

    //Type 1
    public AoC(){
        this.Radius = 5;
        this.Area = Math.PI * Radius * Radius;
    }

    //Type 2
    public AoC(double Radius){
        this.Radius = Radius;
        this.Area = (Radius * 1.8) + 32;
    }

    //Type 3

    public double getAoC(){
        return AoC;
    }
}