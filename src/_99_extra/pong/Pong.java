package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 50;
    int y = 50;
    int ySpeed = 5;
    int xSpeed = 5;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(255,255,255);
    	ellipse(x, y, 90, 80);
    	fill(125, 135, 250) ;
    	stroke(125, 135, 250);
    	y+= ySpeed;
    	
    	x += xSpeed ;
    	if(x > width && y > height){
    		ySpeed = -ySpeed;
    	    xSpeed = -xSpeed;
    	}
    	
    	rect(mouseX, 560, 150,50);
    	
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}