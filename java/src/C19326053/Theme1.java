package C19326053;

public class Theme1 extends Visual
{
    MyVisual t1;
    float border = 50;
    float rotation = 0;
    float length = 0;
    public Theme1(MyVisual t1)
    {
        this.t1 = t1;
    }

    public void render()
    {
        //borders
        for(int i = 50 ; i < 450 ; i ++)
        {
            float color1 = map(i, 0, t1.getAudioBuffer().size(), 0, 255);
            t1.stroke(color1, 255, 255);
            t1.line(t1.width - t1.menuWidth - i, border, t1.width - t1.menuWidth - i, border + border * t1.getAudioBuffer().get(i));
            t1.line(border, i, border + border * t1.getAudioBuffer().get(i), i);
            t1.line(i, t1.height - border, i, t1.height - border + border * t1.getAudioBuffer().get(i));
            t1.line(t1.width - t1.menuWidth - border, t1.height - i, t1.width - t1.menuWidth - border + border * t1.getAudioBuffer().get(i), t1.height - i);
        }

        //circles
        t1.noStroke();
        float color2 = (float) t1.random(255);
        t1.fill(color2, 255, 255);
        t1.circle(border, border, 10 + t1.getSmoothedAmplitude() * 100);
        t1.circle(border, t1.height - border, 10 + t1.getSmoothedAmplitude() * 100);
        t1.circle(t1.width - t1.menuWidth - border, border, 10 + t1.getSmoothedAmplitude() * 100);
        t1.circle(t1.width - t1.menuWidth - border, t1.height - border, 10 + t1.getSmoothedAmplitude() * 100);

        //flower
        t1.pushMatrix();
        t1.translate(250, 250);
        t1.rotate(rotation);
        for(int j = 0; j < 8; j++)
        {
            t1.rotate(TWO_PI / 8 * j);
            t1.noStroke();
            float c = map(j, 0, 8, 0, 255);
            t1.fill(c,255,255);
            t1.ellipse(0, 90, 40, 120 + length);
        }
        t1.popMatrix();
        t1.fill(255);
        t1.circle(250 ,250, 25 + length / 5);
        t1.fill(0);
        t1.circle(250 ,250, 10);
        update();
    }

    public void update()
    {        
        rotation = rotation + t1.getSmoothedAmplitude() * 0.1f;
        length = t1.getSmoothedAmplitude() * 500f;
    }
}