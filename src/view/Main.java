package view;

import model.Circle;
import model.Square;
import processing.core.PApplet;
import processing.core.PImage;
import processing.event.MouseEvent;

public class Main extends PApplet {

	Circle circle;
	Square square;
	PImage overlay;
	int squareSize;
	int circleSize;
	boolean squareOdd;
	boolean circleOdd;
	boolean drawSquare;
	boolean drawCircle;
	int angle=0;
	int barY;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	public void settings() {
		size(800,600);

	}
	public void setup() {
		squareSize=500;
		circleSize=500;
		circle=new Circle(400,300,this);
		square=new Square(400,300,this);
		rectMode(CENTER);
		overlay=loadImage("img/Zoom-menu.png");
		drawSquare=false;
		drawCircle=false;
		squareOdd=false;
		circleOdd=true;
		barY=301;
	
	}



	public void draw() {

		background(255);
		noStroke();
		if(drawSquare==true) {
			square.draw(squareSize,squareOdd);
		}

		if(drawCircle==true) {
			circle.draw(circleSize,circleOdd);
		}
		rotate(0);
		image(overlay,0,0,800,600);
		fill(255,0,0);
		rect(744,barY,17,4);

	}

	public void mouseWheel(MouseEvent event) {
		float e = event.getCount();

		if(drawSquare==true) {
			if(e<0) {
				if(squareSize<1000) {
					squareSize+=10;  
					barY-=3;
					angle=square.getAngle()+15;
					square.setAngle(angle);
				}
			
				
				
			}else {
				if(squareSize>10) {
				squareSize-=10;  
				barY+=3;
				angle=square.getAngle()-15;
				square.setAngle(angle);
				}
			} 
		}

		if(drawCircle==true) {
			if(e<0) {
				if(circleSize<1000) {
					barY-=3;
					circleSize+=10; 
				}
				 
			}else {
				if(circleSize>10) {
				barY+=3;
				circleSize-=10;   
				}
			} 
		}
	}

	public void mousePressed() {
		
		if(mouseX>40 && mouseX<210 && mouseY>520 && mouseY<575) {
			drawSquare=false;
			drawCircle=true;
			circleSize=500;
			barY=301;

		}
		if(mouseX>225 && mouseX<400 && mouseY>520 && mouseY<575) {
			drawSquare=true;
			drawCircle=false;
			squareSize=500;
			barY=301;

		}

	}

}
