package Main;

import java.awt.Color;
import java.awt.Font;

import Rendering.Graphics;

public class Dickson extends Entity {
	int imgNum = 0;

	public Dickson() {
		xpos = Math.random() * (WildoLauncher.width - width);
		ypos = Math.random() * (WildoLauncher.height - height);
		xvel = ((Math.random() * (max * 2)) - max) * WildoLauncher.width;
		yvel = ((Math.random() * (max * 2)) - max) * WildoLauncher.height;
		imgNum = (int) (Math.random() * GameState.decoys.size());
	}

	public void render(Graphics g) {
		g.drawImage(GameState.decoys.get(imgNum), xpos, ypos, width, height);
	}
}
