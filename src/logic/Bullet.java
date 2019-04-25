package logic;

public abstract class Bullet extends CollidableEntity {

	protected int damage;
	protected int speed;
	protected double angle;
	protected int z = 5;
	public abstract void setDestroy();
}
