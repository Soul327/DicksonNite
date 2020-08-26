package Main;

import Misc.Graphics;

public class StateManager {
	GameState gameState;
	
	public StateManager() {
		gameState = new GameState();
	}
	
	public void tick() {
		gameState.tick();
	}
	public void render(Graphics g) {
		gameState.render(g);
	}
}