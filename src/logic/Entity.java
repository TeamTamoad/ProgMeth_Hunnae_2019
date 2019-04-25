package logic;

import sharedObject.IRenderable;

public abstract class Entity implements IRenderable{
	
	protected int x,y;
	protected int z;
	protected boolean visible,destroyed;
	
	protected Entity() {
		visible = true;
		destroyed = false;
	}
	
	
	@Override
	public boolean isDestroyed() {
		return destroyed;
	}
	
	@Override
	public boolean isVisible() {
		return visible;
	}
	
	@Override
	public int getZ() {
		return z;
	}
	public void move(double angle,int speed) {
		x+=speed*Math.cos(angle);
		y+=speed*Math.sin(angle);
	}

}
