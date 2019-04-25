package logic;

import javafx.scene.canvas.GraphicsContext;

public class NormalBullet extends Bullet {

	public NormalBullet(int x, int y, int damage, int speed, double angle, int radius) {
		this.x = x;
		this.y = y;
		this.damage = damage;
		this.speed = speed;
		this.angle = angle;
		this.radius = radius;
	}

	@Override
	public void tick() {
		move(angle, speed);
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setDestroy() {
		this.destroyed=true;
	}

	

}
