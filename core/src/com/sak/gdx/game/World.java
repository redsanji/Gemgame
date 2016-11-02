package com.sak.gdx.game;

public class World {
	private Gem gem;
    private GemGame gemGame;
 
    World(GemGame gemGame) {
        this.gemGame = gemGame;
 
        gem = new Gem(100,100);
    }
 
    Gem getGem() {
        return gem;
    }
}
