package com.sak.gdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sak.gdx.game.GemGame;

public class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = GemGame.WIDTH;
        config.height = GemGame.HEIGHT;
        new LwjglApplication(new GemGame(), config);
    }
}
