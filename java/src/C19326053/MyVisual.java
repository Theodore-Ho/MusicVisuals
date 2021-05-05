package C19326053;

public class MyVisual extends Visual
{    
    Theme1 t1;
    Theme2 t2;
    Theme3 t3;
    Theme4 t4;
    public float menuWidth = 200;
    public int themeChoice = 0;
    public int rectBottom = 20;
    public float h;

    void menu()
    {
        fill(255);
        noStroke();
        rect(width - menuWidth, 0, menuWidth, height);
        textSize(14);
        fill(0);
        textAlign(CENTER, CENTER);
        text("MENU", width - menuWidth / 2, 15);

        //start / pause button
        stroke(0);
        noFill();
        strokeWeight(2);
        circle(width - menuWidth + 55, 50, 40);
        line(width - menuWidth + 45, 40, width - menuWidth + 45, 60);
        line(width - menuWidth + 45, 40, width - menuWidth + 60, 50);
        line(width - menuWidth + 60, 50, width - menuWidth + 45, 60);
        line(width - menuWidth + 60, 40, width - menuWidth + 60, 60);
        line(width - menuWidth + 65, 40, width - menuWidth + 65, 60);

        //rewind button
        circle(width - 55, 50, 40);
        circle(width - 55, 50, 20);
        noStroke();
        fill(255);
        rect(width - 55, 50, -10, -10);
        stroke(0);
        strokeWeight(2);
        line(width - 55, 40, width - 48, 37);
        line(width - 55, 40, width - 51, 48);

        for(int i = 0; i < 4; i++)
        {
            float c = map(i, 0, 4, 80, height - rectBottom);
            h = map(1, 0, 4, 80, height - rectBottom) - map(0, 0, 4, 80, height - rectBottom) - 10;
            stroke(0);
            strokeWeight(1);
            fill(i * 64, 128, 128);
            rect(width - menuWidth + 10, c, menuWidth - 20, h, 20);
            textAlign(CENTER, CENTER);
            fill(0);
            text("Theme  " + (i + 1), width - menuWidth / 2, c + h / 2);
            fill(255);
            text("Theme  " + (i + 1), width - menuWidth / 2 - 1, c + h / 2 - 1);
        }
    }

    public void mouseClicked()
	{
        float[] y = new float[4];
        for(int i = 0; i < 4; i++)
        {
            y[i] = map(i, 0, 4, 80, height - rectBottom);
        }
		if(mouseX > width - menuWidth)
        {
            if(mouseY > 30 && mouseY < 70)
            {
                if(mouseX > width - menuWidth + 35 && mouseX < width - menuWidth + 75)
                {
                    if(getAudioPlayer().isPlaying())
                    {
                        getAudioPlayer().pause();
                    }
                    else
                    {
                        getAudioPlayer().play();
                    }
                }
                if(mouseX > width - 75 && mouseX < width - 35)
                {
                    if(getAudioPlayer().isPlaying())
                    {
                        getAudioPlayer().rewind();
                        getAudioPlayer().play();
                    }
                    else
                    {
                        getAudioPlayer().rewind();
                    }
                }
            }
            else if(mouseY > y[0] && mouseY < y[0] + h)
            {
                themeChoice = 1;
            }
            else if(mouseY > y[1] && mouseY < y[1] + h)
            {
                themeChoice = 2;
            }
            else if(mouseY > y[2] && mouseY < y[2] + h)
            {
                themeChoice = 3;
            }
            else if(mouseY > y[3] && mouseY < y[3] + h)
            {
                themeChoice = 4;
            }
        }
        else
        {
            themeChoice = 0;
        }
	}
    
    public void settings()
    {
        size(700, 500);
    }

    public void setup() {
        startMinim();
        loadAudio("Ballade pour Adeline.mp3");
        colorMode(HSB);
        t1 = new Theme1(this);
        t2 = new Theme2(this);
        t3 = new Theme3(this);
        t4 = new Theme4(this);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            if(getAudioPlayer().isPlaying())
            {
                getAudioPlayer().pause();
            }
            else
            {
                getAudioPlayer().play();
            }
        }
    }

    public void draw()
    {
        background(0);
        menu();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
        calculateAverageAmplitude();
        
        if(themeChoice == 0)
        {
            textAlign(CENTER,CENTER);
            fill(255);
            text("Object Oriented Programming Assignment", 250, 150);
            text("Music Visual", 250, 180);
            text("Yuhong He", 250, 235);
            text("C19326053", 250, 265);
            text("TU856-2", 250, 320);
            text("May, 2021", 250, 350);
        }
        switch(themeChoice)
        {
            case 1: t1.render(); break;
            case 2: t2.render(); break;
            case 3: t3.render(); break;
            case 4: t4.render(); break;
        }
    }
}