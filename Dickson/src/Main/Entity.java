package Main;

import java.awt.Color;
import java.io.File;

import Rendering.Graphics;
import Misc.MouseManager;
import Misc.SoundManager;

public abstract class Entity {
	
	double xpos, ypos, xvel, yvel;
	static double width = 200, height=200;
	static double max=.002;
	
	public void getSound() {
		if(SoundManager.getSoundsSize()>0 | true) return;
		File[] list = new File("Assets/pings and scrapes").listFiles();
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
		if(xpos >= WildoLauncher.width - width && xvel>0) {
			xvel *= -1;
			getSound();
		}
		if(ypos >= WildoLauncher.height - height && yvel>0) {
			yvel *= -1;
			getSound();
		}
		if(this instanceof Wildo) {
			int mx = MouseManager.mouseX;
			int my = MouseManager.mouseY;
			boolean leftClick = MouseManager.leftPressed;
			if((mx <= xpos + width && mx >= xpos) && (my <= ypos + height && my >= ypos) && (leftClick)){
				//do something later
				GameState.newLevel();
			}
		}
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.fillRect(xpos,ypos,width,height);
	}
}
