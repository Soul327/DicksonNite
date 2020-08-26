package Main;

import java.awt.Color;
import java.awt.Font;

import Misc.Graphics;

public class Dickson extends Entity {
	int imgNum = 0;
	public Dickson() {
		xpos = Math.random() * (Main.width - width);
        ypos = Math.random() * (Main.height - height);
        xvel = ( (Math.random() * (max*2)) - max ) * Main.width; 
        yvel = ( (Math.random() * (max*2)) - max ) * Main.height;
        imgNum = (int)(Math.random() * GameState.decoys.size());
	}
	public void render(Graphics g){
		g.drawImage(GameState.decoys.get(imgNum),xpos,ypos,width,height);
//        g.setColor(Color.white);
//        g.setFont( "Serif",Font.PLAIN,15 );
//        g.drawOutlinedString(xvel+"", xpos, ypos+g.fontSize);
	}
}
