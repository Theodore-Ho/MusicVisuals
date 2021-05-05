package C19326053;

import java.util.ArrayList;

public class Theme4 extends Visual
{
    MyVisual t4;
    ArrayList<Bubble> bubble1 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble2 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble3 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble4 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble5 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble6 = new ArrayList<Bubble>();
    ArrayList<Bubble> bubble7 = new ArrayList<Bubble>();

    public Theme4(MyVisual t4)
    {
        this.t4 = t4;
    }

    public void render()
    {
        float[] x = new float[10];
        for(int j = 0; j < 10; j ++)
        {
            x[j] = map(j, 0, 10, 0, 500);
        }
        float[] color = new float[7];
        for(int k = 0; k < 7; k ++)
        {
            color[k] = map(k, 0, 7, 0, 255);
        }
        if(t4.getSmoothedBands()[1] > 0)
        {
            Bubble b1 = new Bubble((int)x[2], 50, t4.getSmoothedBands()[1] / 10);
            bubble1.add(b1);
            Bubble b2 = new Bubble((int)x[3], 50, t4.getSmoothedBands()[1] / 10);
            bubble2.add(b2);
            Bubble b3 = new Bubble((int)x[4], 50, t4.getSmoothedBands()[1] / 10);
            bubble3.add(b3);
            Bubble b4 = new Bubble((int)x[5], 50, t4.getSmoothedBands()[1] / 10);
            bubble4.add(b4);
            Bubble b5 = new Bubble((int)x[6], 50, t4.getSmoothedBands()[1] / 10);
            bubble5.add(b5);
            Bubble b6 = new Bubble((int)x[7], 50, t4.getSmoothedBands()[1] / 10);
            bubble6.add(b6);
            Bubble b7 = new Bubble((int)x[8], 50, t4.getSmoothedBands()[1] / 10);
            bubble7.add(b7);
        }
        for(int i = 0; i < bubble1.size(); i++)
        {
            t4.noStroke();
            float c = random(50, 250);
            t4.fill(color[0], c, 200);
            t4.circle((int)x[2], 50, 200 * t4.getSmoothedAmplitude());
            bubble1.get(i).update();
            t4.circle(bubble1.get(i).getX(), bubble1.get(i).getY(), bubble1.get(i).getRadius());

            t4.fill(color[1], c, 200);
            t4.circle((int)x[3], 50, 200 * t4.getSmoothedAmplitude());
            bubble2.get(i).update();
            t4.circle(bubble2.get(i).getX(), bubble2.get(i).getY(), bubble2.get(i).getRadius());

            t4.fill(color[2], c, 200);
            t4.circle((int)x[4], 50, 200 * t4.getSmoothedAmplitude());
            bubble3.get(i).update();
            t4.circle(bubble3.get(i).getX(), bubble3.get(i).getY(), bubble3.get(i).getRadius());

            t4.fill(color[3], c, 200);
            t4.circle((int)x[5], 50, 200 * t4.getSmoothedAmplitude());
            bubble4.get(i).update();
            t4.circle(bubble4.get(i).getX(), bubble4.get(i).getY(), bubble4.get(i).getRadius());

            t4.fill(color[4], c, 200);
            t4.circle((int)x[6], 50, 200 * t4.getSmoothedAmplitude());
            bubble5.get(i).update();
            t4.circle(bubble5.get(i).getX(), bubble5.get(i).getY(), bubble5.get(i).getRadius());

            t4.fill(color[5], c, 200);
            t4.circle((int)x[7], 50, 200 * t4.getSmoothedAmplitude());
            bubble6.get(i).update();
            t4.circle(bubble6.get(i).getX(), bubble6.get(i).getY(), bubble6.get(i).getRadius());

            t4.fill(color[6], c, 200);
            t4.circle((int)x[8], 50, 200 * t4.getSmoothedAmplitude());
            bubble7.get(i).update();
            t4.circle(bubble7.get(i).getX(), bubble7.get(i).getY(), bubble7.get(i).getRadius());
        }
    }
}