package logic;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;

public class NormalShip extends Ship {

	public NormalShip(int x, int y, double hp, int speed, int price) {
		super(x, y, hp, speed, price);

	}

	@Override
	public void tick() {
		for (Entity x : gameLogic.getGameObjectContainer()) {
			if (x instanceof Bullet) {
				Bullet bullet = (Bullet) x;
				if (collideWith(bullet))
					getHit(bullet);
			}
		}

	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getHit(Bullet bullet) {
		this.hp = this.hp - bullet.damage;
		bullet.setDestroy();
	}

}
