package C19326053;

public class Theme2 extends Visual
{
    MyVisual t2;
    public float rotation = 0;

    public Theme2(MyVisual t2)
    {
        this.t2 = t2;
    }

    public void render()
    {
        t2.pushMatrix();
        t2.translate(250, 250);
        for(int i = 3; i < 15 ; i++)
        {
            t2.rotate(rotation * i);
            float theta = TWO_PI / (float) i;
            float change = 50 * i * t2.getSmoothedAmplitude();
            float radius = i * 10 + change;
            t2.stroke(255);
            t2.strokeWeight(3);
            for(int j = 1 ; j <= i ; j ++)
            {
                float x1 = sin(theta * (j - 1)) * radius;
                float y1 = cos(theta * (j - 1)) * radius;
                float x2 = sin(theta * j) * radius;
                float y2 = cos(theta * j) * radius;
                float c = map(i - 3, 0, 12, 0, 255);
                t2.stroke(c, 255, 255);
                t2.line(0 + x1, 0 + y1, 0 + x2, 0 + y2);
            }
        }
        t2.popMatrix();
        update();
    }

    public void update()
    {        
        rotation = rotation + t2.getSmoothedAmplitude() * 0.1f;
    }
}