package Main;

import Misc.Graphics;

public class StateManager {
	GameState gameState;
	static MenuState menuState;
	
	public StateManager() {
		gameState = new GameState();
		menuState = new MenuState();
	}
	
	public void tick() {
		gameState.tick();
		if(GameState.levelCount==0+1) menuState.tick();
	}
	public void render(Graphics g) {
		gameState.render(g);
		if(GameState.levelCount==0+1) menuState.render(g);
	}
}