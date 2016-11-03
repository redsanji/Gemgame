package com.sak.gdx.game;

public class Maze {
	private String[] MAP = new String [] {
            "&&&&&&&&&&&&&&&&&&&&",
            "###################&",
            "########....#######&",
            "&#######....#######&",
            "&#######....#######&",
            "&##################&",
            "&##################&",
            "&#############...##&",
            "&#############...##&",
            "&#############...##&",
            "&###################",
            "&###################",
            "&&&&&&&&&&&&&&&&&&&&"    
    };
	private int height;
    private int width;
 
    public Maze() {
        height = MAP.length;
        width = MAP[0].length();
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getWidth() {
        return width;
    }
    public boolean hasSandAt(int r, int c) {
        return MAP[r].charAt(c) == '#';
    }
 
    public boolean hasWaterAt(int r, int c) {
        return MAP[r].charAt(c) == '.';
    }
    public boolean hasWallAt(int r, int c){
    	return MAP[r].charAt(c) == '&';
    }

}
