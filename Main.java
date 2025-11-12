public class Main {
    public static void main(String[]args) {
        Square s1 = new Square();
        Square s2 = new Square(5, 5);
        Square s3 = new Square(2, 3, 10, 10);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Area of s3: " + s3.getArea());
        System.out.println("Perimeter of s3: " + s3.getPerimeter());

        s3.setPosition(5, 5);
        System.out.println("Moved s3 -> " + s3);
    }
}