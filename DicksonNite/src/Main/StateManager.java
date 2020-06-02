package Main;

import java.awt.Color;
import java.awt.event.KeyEvent;

import Misc.Graphics;
import Misc.KeyManager;

public class StateManager {
	
	//ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();
	int[] numb = new int[1000];
	int offset = 0,size = 10;
	
	public StateManager() {
		for(int x=0;x<1000;x++) roll();
		offset = 8;
	}
	public int roll(int x) {
		return (int)( Math.random()*x + 1 );
	}
	public void roll() {
		int num  = 0;
		for(int y=0;y<20;y++) 
			num += roll(20);
		numb[num]++;
	}
	
	public void tick() {
		roll();
		
		if(KeyManager.keyRelease(KeyEvent.VK_UP)) size++;
		if(KeyManager.keyRelease(KeyEvent.VK_DOWN)) size--;
		if(KeyManager.keys[KeyEvent.VK_LEFT]) offset--;
		if(KeyManager.keys[KeyEvent.VK_RIGHT]) offset++;
		
	}
	public void render(Graphics g) {
		for(int x=0;x<numb.length;x++) {
			g.setColor(Color.gray);
			if(x%2==0) g.drawLine((size*x)-offset*size, Main.height-size, (size*x)-offset*size, Main.height-5);
			if(x%10==0) g.drawLine((size*x)-offset*size, Main.height-size, (size*x)-offset*size, Main.height);
			//if(x%10==0) g.drawLine((size*x)-offset*size, Main.height-size, (size*x)-offset*size, Main.height-20+size/2);
			
			g.setColor(Color.white);
			for(int y=0;y<numb[x];y++) 
				g.fillCenterCircle((size*x)-offset*size, Main.height-((y+2)*size), size);
		}
	}
}