package model;

import processing.core.PApplet;

public abstract class Shape {
	
	private int posX;
	private int posY;
	private int limitMin;
	private PApplet app;
	
	public Shape(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app=app;
		this.limitMin =2;
	}


	


	public abstract void draw(float size, boolean odd);
	
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	

	public int getLimitMin() {
		return limitMin;
	}

	public void setLimitMin(int limitMin) {
		this.limitMin = limitMin;
	}
	
	public PApplet getApp() {
		return app;
	}

	
	

}
