package com.sak.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GemGame extends Game {
    public SpriteBatch batch;
    public static final int HEIGHT = 520;
    public static final int WIDTH = 800;
    private Music music;
    
 
    @Override
    public void create () {
        batch = new SpriteBatch();
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
 
    @Override
    public void dispose () {
        batch.dispose();
        music.dispose();
    }
    
}
