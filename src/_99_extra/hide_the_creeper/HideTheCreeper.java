package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
PImage creeper;
int x=1;
int y=100;
    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
    	
    	PImage minecraft = loadImage("minecraft.jpeg"); 
    	minecraft.resize(WIDTH, HEIGHT);
    	background(minecraft);
    	creeper=loadImage("creeper.jpeg");
    	creeper.resize(4, 8);
    	
    }

    @Override
    public void draw() {
    image(creeper,x,y);
    fill(250,0,3);
    ellipse(2,3,4,5);
    
    
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
