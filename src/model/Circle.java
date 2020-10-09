package model;

import processing.core.PApplet;

public class Circle extends Shape{

	public Circle(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
	}

	@Override
	public void draw(float size, boolean odd) {
		if(odd==true) {
			getApp().fill(120);
			getApp().ellipse(getPosX(), getPosY(), size, size);
		}else {
			getApp().fill(255,10,0);
			getApp().ellipse(getPosX(), getPosY(), size, size);
		}
		
			  if(size > getLimitMin()) {
				  size*=0.85f;
				  odd=!odd;
				  draw(size, odd); 
			  }
		
	
		    
		
	}


	
	

}
