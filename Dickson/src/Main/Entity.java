package Main;

import java.awt.Color;
import java.io.File;

import Misc.Graphics;
import Misc.SoundManager;

public abstract class Entity {
	
	double xpos, ypos, xvel, yvel;
	double width = 50, height=50;
	
	public void getSound() {
		File file = new File("Assets/pings and scrapes");
		File[] list = file.listFiles();
		int rand = (int)(Math.random()*list.length);
		for(int x=0;x<list.length;x++) 
			if(rand == x) {
				SoundManager.playSound(list[x].getAbsolutePath(), 1);
				break;
			}
	}

	public void tick(){
		xpos += xvel;
		ypos += yvel;
		if(xpos <= 0.0 && xvel<0) {
			xvel *= -1;
			getSound();
		}
		if(ypos <= 0.0 && yvel<0) {
			yvel *= -1;
			getSound();
		}
		if(xpos >= Main.width - width && xvel>0) {
			xvel *= -1;
			getSound();
		}
		if(ypos >= Main.height - height && yvel>0) {
			yvel *= -1;
			getSound();
		}
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.fillRect(xpos,ypos,width,height);
	}
}
