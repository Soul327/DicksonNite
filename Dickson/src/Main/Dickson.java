package Main;

public class Dickson extends Entity {
	public Dickson() {
        double max = 0.010;
		xpos = Math.random() * (Main.width - width);
        ypos = Math.random() * (Main.height - height);
        xvel = ( (Math.random() * (max*2)) - max ) * Main.width; 
        yvel = ( (Math.random() * (max*2)) - max ) * Main.height;
	}
}
