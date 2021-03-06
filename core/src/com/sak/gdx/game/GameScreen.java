package com.sak.gdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	World world; 
	static SpriteBatch batch;
	Texture player;
	static Texture q,a,z,r,d,b;
	public static int winner;
	public static long time = System.currentTimeMillis();
    public static long randomNum = time+MathUtils.random(2000, 3000);
    public static final int buttonP1 = MathUtils.random(1, 6);
	private Texture gemImg;
	private GemGame gemGame;
	private Gem gem;
	private WorldRenderer worldRenderer;	
 
    public GameScreen(GemGame gemGame) {
        this.gemGame = gemGame;
        world = new World(gemGame);
        gem = world.getGem();
        worldRenderer = new WorldRenderer(gemGame, world);
    }
    @Override
    public void render(float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer.render(delta);
        
    }
    private void update(float delta) {
    	updateGemDirection();
    	world.update(delta);
    }
    private void updateGemDirection() {
    	Gem gem = world.getGem();
    	if(Gdx.input.isKeyPressed(Keys.UP)) {
    		gemImg = new Texture("soldierup.png");
    		gem.setNextDirection(Gem.DIRECTION_UP);
	        }
		else if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			gemImg = new Texture("soldierleft.png");
			gem.setNextDirection(Gem.DIRECTION_LEFT);
         }
        else if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	gemImg = new Texture("soldierright.png");
        	gem.setNextDirection(Gem.DIRECTION_RIGHT);
         }
        else if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	gemImg = new Texture("soldierdown.png");
        	gem.setNextDirection(Gem.DIRECTION_DOWN);
         }
        else
        {
        	gem.setNextDirection(Gem.DIRECTION_STILL);
        }
    }
    
 

}
