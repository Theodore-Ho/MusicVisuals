package C19326053;

import java.util.ArrayList;

public class Theme3 extends Visual
{
    MyVisual t3;
    ArrayList<Circle> circle = new ArrayList<Circle>();

    public Theme3(MyVisual t3)
    {
        this.t3 = t3;
    }

    public void render()
    {
        float gap = (t3.width - t3.menuWidth) / (float) t3.getBands().length;
        t3.noStroke();
        for(int i = 0 ; i < t3.getSmoothedBands().length ; i ++)
        {
            float color = map(i, 0, t3.getBands().length, 255, 0);
            t3.fill(color, 255, 255);
            t3.rect(i * gap, t3.height, gap, -5);
            if(t3.getBands()[i] > 180)
            {
                Circle c = new Circle(i * gap + gap / 2, t3.height, gap - 20, color);
                circle.add(c);
            }
        }
        for(int j = 0; j < circle.size(); j++)
        {
            circle.get(j).update();
            t3.stroke(circle.get(j).getColor(), 255, 255);
            t3.noFill();
            t3.circle(circle.get(j).getX(), circle.get(j).getY(), circle.get(j).getRadius());
        }
    }
}