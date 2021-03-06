package com.sak.gdx.game;

public class Maze {
	private char[][] MAP = new char [][] {
			{'&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&'},
			{'&','%','#','&','#','#','&','#','#','#','&','#','&','#','#','#','#','#','&','&'},
			{'&','%','&','#','&','#','#','&','.','.','.','.','#','#','&','&','#','&','#','&'},
			{'&','#','#','#','#','#','&','#','&','.','&','.','#','#','#','&','#','&','#','&'},
			{'&','#','&','#','&','#','#','#','.','.','&','.','&','#','#','#','&','#','#','&'},
			{'&','&','#','#','#','#','&','#','#','#','#','&','#','&','#','&','#','#','&','&'},
			{'&','#','&','#','&','#','#','&','&','#','&','#','#','#','#','#','#','#','#','&'},
			{'&','&','#','&','.','&','.','#','#','&','#','&','#','&','.','&','.','#','&','&'},
			{'&','#','&','#','.','.','&','#','#','#','#','#','#','#','.','&','.','&','#','&'},
			{'&','&','#','#','&','.','.','&','&','#','&','#','#','&','.','&','.','#','&','&'},
			{'&','#','&','#','#','#','&','#','#','#','#','#','#','#','&','#','#','&','.','&'},
			{'&','#','#','&','#','&','#','#','&','#','&','#','&','#','#','&','#','#','.','&'},
			{'&','&','&','#','#','#','#','&','&','#','&','&','&','&','#','&','#','&','&','&'},
			{'&','.','&','#','&','#','#','&','.','.','.','.','#','#','&','&','#','#','#','&'},
			{'&','#','#','#','#','#','&','#','&','.','&','.','#','&','#','&','#','&','#','&'},
			{'&','#','&','#','&','#','#','#','.','.','&','.','&','#','&','#','&','#','#','&'},
			{'&','&','#','#','#','#','&','#','#','#','#','&','#','&','#','&','#','#','&','&'},
			{'&','#','&','#','&','#','#','&','&','#','&','#','#','#','#','#','#','#','#','&'},
			{'&','&','#','&','.','.','.','#','#','&','#','&','#','&','.','&','.','#','&','&'},
			{'&','#','&','#','.','.','&','#','#','#','#','#','#','#','.','&','.','&','#','&'},
			{'&','&','#','#','&','.','.','&','&','#','&','#','#','&','.','&','.','#','&','&'},
			{'&','#','&','#','#','#','&','#','#','#','#','#','#','#','&','#','#','#','.','&'},
			{'&','#','#','&','#','&','#','#','&','#','&','#','&','#','#','&','#','$','$','&'},
			{'&','&','#','#','#','#','&','#','#','#','#','&','#','&','#','&','#','$','$','&'},
			{'&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&','&'},
    };
	private int height;
    private int width;
 
    public Maze() {
        height = MAP.length;
        width = MAP[1].length;
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getWidth() {
        return width;
    }
    public boolean hasSandAt(int r, int c) {
        return MAP[r][c] == '#';
    }
    public boolean hasWaterAt(int r, int c) {
        return MAP[r][c] == '.';
    }
    public boolean hasWallAt(int r, int c){
    	return MAP[r][c]== '&';
    }
    public boolean hasSaveAt(int r, int c){
    	return MAP[r][c] == '$';
    }
    public boolean hasStartAt(int r, int c){
    	return MAP[r][c] == '%';
    }

}
