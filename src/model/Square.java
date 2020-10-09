package model;

import processing.core.PApplet;

public class Square extends Shape implements Rotatable{
	int angle=0;
	public Square(int posX, int posY, PApplet app) {
		super(posX, posY, app);
		
	}

	@Override
	public void draw(float size,boolean odd) {
		
		if(odd==true) {
			getApp().fill(8, 182, 206);
			rotateSquare(size);
		}else {
			getApp().fill(80,220,100);
			getApp().rect(getPosX(), getPosY(), size, size);
		}
		
		
		  if(size > getLimitMin()) {
			  size*=0.85f;
			  odd=!odd;
			  draw(size, odd); 
		  }
		 
	}



	@Override
	public void rotateSquare(float size) {
		
			getApp().pushMatrix();
			getApp().translate(getPosX(), getPosY()); 
			  
			getApp().rotate(PApplet.radians(angle));
			  
			getApp().rect(getPosX()-400, getPosY()-300, size, size);
			getApp().popMatrix();
		
		
	}


	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	
}
