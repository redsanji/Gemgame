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
	public WorldRenderer(GemGame gemGame, World world) {
    this.gemGame = gemGame;
    SpriteBatch batch = gemGame.batch;

    this.world = world;

    gemImg = new Texture("soldierright.png");
}
public void render(float delta) {
	
    SpriteBatch batch = gemGame.batch;
    batch.begin();
    Vector2 pos = world.getGem().getPosition();
    batch.draw(gemImg, pos.x, pos.y);
    batch.end();
}

}
