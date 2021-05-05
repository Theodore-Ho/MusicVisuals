package C19326053;

public class Bubble
{
    private int x;
    private int y;
    private float radius;

    public Bubble(int x, int y, float radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void update()
    {
        x = x - 10 + (int)(Math.random() * (20));
        y = y + 10;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
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
}