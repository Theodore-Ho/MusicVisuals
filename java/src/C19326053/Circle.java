package C19326053;

public class Circle
{
    private float x;
    private int y;
    private float radius;
    private float color;

    public Circle(float x, int y, float radius, float color)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void update() {
        y = y - 3;
        radius = radius - (float) 0.2;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getColor() {
        return color;
    }

    public void setColor(float color) {
        this.color = color;
    }
}