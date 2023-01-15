package _99_extra.pin_the_tail;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 500;
    PImage donkey;
    PImage tail;
    int x ;
    int y ;
    boolean hasclicked ;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {
     donkey = loadImage ("images.jpeg");  
     donkey.resize(WIDTH, HEIGHT);
     tail = loadImage ("tail.png");
     


     
    }

    @Override
    public void draw() {
    	rect(0, 0, WIDTH, HEIGHT);
    	if (dist(50, 220, mouseX, mouseY) < 30) {
    		background (donkey);
    	if (hasclicked) {
    		playWhoohoo();
    	}
    		
    	}
    	
    	if(hasclicked) {
    		image(tail, x-10, y-20);
    		
    	}
    	else {
    		image(tail, mouseX-10, mouseY-20);
    	}
    	
    	
    	rect(50, 220, 30, 30);
    	
    	if(mousePressed) {
    		x = mouseX;
    		y = mouseY;
    		hasclicked = true;
    	}
    	
    	
    	
    	


    }

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
