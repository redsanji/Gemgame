package com.sak.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class GemGame extends Game {
    public static SpriteBatch batch;
    public static final int HEIGHT = 520;
    public static final int WIDTH = 800;
    private Music music;
    public Gem gem;
    public static int winner;
	private Texture youwinner;
    public static boolean trigger=true;
	public static long time = System.currentTimeMillis();
    public static long randomNum = time+MathUtils.random(2000, 3000);
    public static final int button = MathUtils.random(1, 6);
    
 
    @Override
    public void create () {
        batch = new SpriteBatch();
		youwinner = new Texture("winner.png");
        setScreen(new GameScreen(this));
        music = Gdx.audio.newMusic(Gdx.files.internal("Realm's Awakening - Valkyrie Crusade Music Extended.mp3"));
        music.setLooping(true);
        music.setVolume(0.2f);
        music.play();
    }
 
    @Override
    public void render () {
        super.render();
    }
    
    private void drawWinner(int winner) { 
    	if(winner==1){
    		batch.draw(youwinner, 260, 200);
    	}
    }    
 
    @Override
    public void dispose () {
        batch.dispose();
        music.dispose();
    }
    
}
