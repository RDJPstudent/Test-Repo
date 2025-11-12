public class Square {
    private int x, y;
    private int width, height;

    public Square() {
        this(0, 0, 1, 1);
    }

    public Square(int width, int height) {
        this(0, 0, width, height);
    }

    public Square(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width*height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "square at(" + x + ", " + y + "), width=" + width + ", height=" + height;
    }

    public int getX() { return x; }
    public int getU() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
