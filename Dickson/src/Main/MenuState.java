package Main;

import java.awt.Font;

import Misc.Graphics;

public class MenuState {
	public void tick() {
		
	}
	public void render(Graphics g) {
		g.setFont( "Serif",Font.PLAIN,45 );
		int line = 0; String str;
		str = "MAIN MENU"; g.drawOutlinedString(str,Main.width/2-g.getStringLength(str)/2,Main.height/4 + line++*g.fontSize);
		str = "Click the target to continue..."; g.drawOutlinedString(str,Main.width/2-g.getStringLength(str)/2,Main.height/4 + line++*g.fontSize);
	}
}