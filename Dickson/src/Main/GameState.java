package Main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import Misc.Graphics;

public class GameState {

	ArrayList<Entity> entities = new ArrayList<Entity>();
	ArrayList<BufferedImage> decoys = new ArrayList<BufferedImage>();
	BufferedImage theWay;

	public GameState() {
		try{
			decoys.add( ImageIO.read(new File("Assets/dickson.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson2.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson3.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson4.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson5.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson6.png")) );
			decoys.add( ImageIO.read(new File("Assets/dickson7.jpg")) );
			decoys.add( ImageIO.read(new File("Assets/dickson8.jpg")) );
			decoys.add( ImageIO.read(new File("Assets/TheWay.jpg")) );
		}catch(Exception e){}
		for(int x = 0; x < 10; x++) {
			entities.add(new Dickson());
		}
	}
	public void tick() {
		for(Entity e:entities) {
			e.tick();	
		}
	}
	public void render(Graphics g) {
		for(Entity e:entities) {
			e.render(g);
		}
	}
}
