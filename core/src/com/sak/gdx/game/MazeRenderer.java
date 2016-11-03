package com.sak.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {
	
	 private Maze maze;
	 private SpriteBatch batch;
	 private Texture sandImage;
	 private Texture waterImage;
	 private Texture wallImage;
	 private Texture grassImage;
	 private Texture startImage;
	 
	    public MazeRenderer(SpriteBatch batch, Maze maze) {
	        this.maze = maze;
	        this.batch = batch;
	        sandImage = new Texture("sand.png");
	        waterImage = new Texture("water.png");
	        wallImage = new Texture("brick.png");
	        grassImage = new Texture("grass.png");
	        startImage = new Texture("red.png");
	    }
	 
	    public void render() {
	    	batch.begin();
	        for(int r = 0; r < maze.getHeight(); r++) {
	            for(int c = 0; c < maze.getWidth(); c++) {
	            	  int x = c * WorldRenderer.BLOCK_SIZE;
	                  int y = GemGame.HEIGHT - 
	                          (r * WorldRenderer.BLOCK_SIZE) - WorldRenderer.BLOCK_SIZE;
	 
	                if(maze.hasSandAt(r, c)) {
	                    batch.draw(sandImage, x, y);
	                } else if(maze.hasWaterAt(r, c)) {
	                    batch.draw(waterImage, x, y);
	                } else if(maze.hasWallAt(r,c)){
	                	batch.draw(wallImage, x, y);
	                } else if(maze.hasSaveAt(r,c)){
	                	batch.draw(grassImage, x, y);
	                } else if(maze.hasStartAt(r,c)){
	                	batch.draw(startImage, x, y);
	                }
	            }
	        }
	        batch.end();
	    }

}
