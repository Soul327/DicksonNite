package Main;

import Rendering.Graphics;

public class Wildo extends Entity {
	int imgNum = 0;

	public Wildo() {
		xpos = Math.random() * (WildoLauncher.width - width);
		ypos = Math.random() * (WildoLauncher.height - height);
		xvel = ((Math.random() * (max * 2)) - max) * WildoLauncher.width;
		yvel = ((Math.random() * (max * 2)) - max) * WildoLauncher.height;
		imgNum = (int) (Math.random() * GameState.targets.size());
	}

	public void render(Graphics g){
		g.drawImage(GameState.targets.get(imgNum),xpos,ypos,width,height);
	}
}
