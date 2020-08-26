package Main;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import Misc.Graphics;

public class GameState {

	static ArrayList<Entity> entities = new ArrayList<Entity>();
	static ArrayList<BufferedImage> decoys = new ArrayList<BufferedImage>();
	static ArrayList<BufferedImage> targets = new ArrayList<BufferedImage>();

	public GameState() {
		try{
			//Load Decoy
			for(File f:new File("Assets/Decoys").listFiles()) decoys.add( ImageIO.read( f ) );
			//Load Targets
			for(File f:new File("Assets/Targets").listFiles()) targets.add( ImageIO.read( f ) );
		}catch(Exception e){}
		newLevel();
	}
	static int levelCount = 0;
	public static void newLevel() {
		entities = new ArrayList<Entity>();
		entities.add(new Wildo());
		for(int x = 0; x < levelCount*10 ; x++) {
			entities.add(new Dickson());
		}
		if(Entity.max<.013)
			Entity.max *= 1.2;
		Entity.width *= .95;
		Entity.height *= .95;
		levelCount += 1;
	}
	public void tick() {
		for(int z=0;z<entities.size();z++) {
			Entity e = entities.get(z);
			e.tick();	
		}
	}
	public void render(Graphics g) {
		for(int z=0;z<entities.size();z++) {
			Entity e = entities.get(z);
			e.render(g);
		}
		if(!(levelCount==0+1)){
			g.setFont( "Serif",Font.PLAIN,30 );
			g.drawOutlinedString("Level:"+(levelCount-1), 0, g.fontSize);
		}
	}
}
