package C19326053;

import example.CubeVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void startUI2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI2();			
	}
}