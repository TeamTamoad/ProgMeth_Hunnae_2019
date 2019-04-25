package logic;

import sharedObject.IRenderable;

public abstract class Tank extends CollidableEntity {
	protected GameLogic gameLogic;
	protected int level;
	protected int speed;

	public Tank(int x, int y, GameLogic gameLogic, int level, int speed, int radius) {
		this.x = x;
		this.y = y;
		this.gameLogic = gameLogic;
		this.level = level;
		this.speed = speed;
		this.radius = radius;
		this.z = 7;
	}

	public Ship findTarget() {
		gameLogic.sortShip();
		for(Ship ship:gameLogic.getShips()) {
			if(collideWith(ship))return ship;
		}
		return null;
	}

	public abstract void shoot(Ship ship);

}
