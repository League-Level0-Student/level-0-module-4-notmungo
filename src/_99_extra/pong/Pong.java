package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 50;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	
    	ellipse(x, 50, 90, 80);
    	fill(125, 135, 250) ;
    	stroke(125, 135, 250);
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}