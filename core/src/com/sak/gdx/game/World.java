package com.sak.gdx.game;

public class World {
	private Gem gem;
    private GemGame gemGame;
    private Maze maze;
 
    World(GemGame gemGame) {
    	maze = new Maze();
    	gem = new Gem(60,60,maze);
        this.gemGame = gemGame;
 
    }
 
    Gem getGem() {
        return gem;
    }
    Maze getMaze() {
        return maze;
    }
    public void update(float delta) {
        gem.update();
    }
}
