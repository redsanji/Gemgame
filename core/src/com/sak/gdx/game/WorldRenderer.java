package com.sak.gdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	
	private GemGame gemGame;
	private World world;
	private Texture gemImg;
	private MazeRenderer mazeRenderer;
	private Texture batch;
	public static final int BLOCK_SIZE = 40;

	public WorldRenderer(GemGame gemGame, World world) {
    this.gemGame = gemGame;
    SpriteBatch batch = gemGame.batch;
    mazeRenderer = new MazeRenderer(gemGame.batch, world.getMaze());
    this.world = world;
    gemImg = new Texture("soldierright.png");
}
public void render(float delta) {
	mazeRenderer.render();
    SpriteBatch batch = gemGame.batch;
    Vector2 pos = world.getGem().getPosition();
    batch.begin();
    batch.draw(gemImg, pos.x - BLOCK_SIZE/2, 
    GemGame.HEIGHT - pos.y - BLOCK_SIZE/2);
    batch.end();
}

}
