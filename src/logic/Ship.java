package logic;

import java.util.List;

public abstract class Ship extends CollidableEntity {
	protected double hp;
	protected double maxHp;
	protected int speed;
	protected int price;
	protected double distance;
	protected GameLogic gameLogic;
	protected long spawnTime;
	public Ship(int x,int y,double hp, int speed, int price) {
		this.x=x;
		this.y=y;
		this.hp = hp;
		this.maxHp = hp;
		this.speed = speed;
		this.price = price;
		this.z=3;
		this.distance=0;
		spawnTime=gameLogic.getNow();
	}
	public abstract void getHit(Bullet bullet);
	public void updateDistance() {
		distance=(gameLogic.getNow()-spawnTime)*speed/gameLogic.ONE_SEC;
	}
	public double getDistance() {
		return distance;
	}
	
}
