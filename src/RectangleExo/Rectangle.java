package RectangleExo;

public class Rectangle {

    private int height;
    private int large;

    public Rectangle() {
    }

    public Rectangle(int height, int large) {
        this.height = height;
        this.large = large;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getLarge() {
        return large;
    }
    public void setLarge(int large) {
        this.large = large;
    }

    public int calculateSurface() {
        return height * large;
    }

    @Override
    public String toString() {
        return "Rectangle { " + "height = " + height + ", large = " + large + ", surface = " + calculateSurface() + " " + '}';
    }
}
