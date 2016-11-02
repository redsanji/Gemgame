package com.sak.gdx.game;

public class World {
	private Gem gem;
    private GemGame gemGame;
    private Maze maze;
 
    World(GemGame gemGame) {
        this.gemGame = gemGame;
        maze = new Maze();
 
        gem = new Gem(100,100);
    }
 
    Gem getGem() {
        return gem;
    }
    Maze getMaze() {
        return maze;
    }
}
