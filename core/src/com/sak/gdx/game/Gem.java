package com.sak.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Gem {
	public static boolean winthegame;
	static SpriteBatch batch; 
	private Vector2 position;
	private int currentDirection;
    private int nextDirection;
	private Maze maze;
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    public static final int SPEED = 5;
    private Texture youwinner;
	private int winner;
	public GemGame gemgame;
    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
	 
    public Gem(int x, int y, Maze maze) {
        position = new Vector2(x,y);
        currentDirection = DIRECTION_STILL;
        nextDirection = DIRECTION_STILL;
        this.maze = maze;
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    public void move(int dir) { 
    	position.x += SPEED * DIR_OFFSETS[dir][0];
        position.y += SPEED * DIR_OFFSETS[dir][1];
    }
    public void setNextDirection(int dir) {
        nextDirection = dir;
    }
    public void update() {
        if(isAtCenter()) {
            if(canMoveInDirection(nextDirection)) {
                currentDirection = nextDirection;    
            }
            else {
                currentDirection = DIRECTION_STILL;    
            }
        }
        if (winthegame(1)){
        	drawWinner(1);
        }
        position.x += SPEED * DIR_OFFSETS[currentDirection][0];
        position.y += SPEED * DIR_OFFSETS[currentDirection][1];
    }
    private int getRow() {
        return ((int)position.y) / WorldRenderer.BLOCK_SIZE; 
    }
 
    private int getColumn() {
        return ((int)position.x) / WorldRenderer.BLOCK_SIZE; 
    }
    public boolean isAtCenter() {
        int blockSize = WorldRenderer.BLOCK_SIZE;
 
        return ((((int)position.x - blockSize/2) % blockSize) == 0) &&
                ((((int)position.y - blockSize/2) % blockSize) == 0);
    }
    private boolean canMoveInDirection(int dir) {
        int newRow = getRow()+DIR_OFFSETS[nextDirection][1]; 
        int newCol = getColumn()+DIR_OFFSETS[nextDirection][0];
		if(maze.hasWallAt(newRow, newCol))
        {
        	return false;
        } else{ 
        	return true;
        }
    }
    public boolean winthegame(int dir) {
        int newRow = getRow()+DIR_OFFSETS[nextDirection][1]; 
        int newCol = getColumn()+DIR_OFFSETS[nextDirection][0];
		if(maze.hasSaveAt(newRow, newCol))
        {		
			return true;
        }
		return false;
    }
    private void drawWinner(int winner) { 
    	youwinner = new Texture("winner.png");
    	if(winner==1){
    		batch.draw(youwinner, 600, 450);
    	}
    }  
}
