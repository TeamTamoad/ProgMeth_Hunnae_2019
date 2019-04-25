package logic;

import javafx.scene.canvas.GraphicsContext;

public class NormalTank extends Tank {
	
	private static final int PRICE = 10;
	private double angle=0;
	private long lastTimeShoot=0;
	public NormalTank(int x, int y,GameLogic gameLogic) {
		super(x, y, gameLogic, 1, 10, 100);
	}

	@Override
	public void shoot(Ship ship) {
		angle = Math.atan2(ship.y - this.y, ship.x - this.x);
		NormalBullet bullet;
		if(level==1)bullet=new NormalBullet(this.x, this.y, 10, 5, angle, 10);
		if(level==2)bullet=new NormalBullet(this.x, this.y, 15, 6, angle, 10);
		if(level==3)bullet=new NormalBullet(this.x, this.y, 25, 7, angle, 10);
	}

	@Override
	public void tick() {
		long currentTime=gameLogic.getNow();
		if(currentTime-lastTimeShoot>gameLogic.ONE_SEC*10/speed) {
			Ship ship=findTarget();
			if(findTarget()!=null) {
				shoot(ship);
				lastTimeShoot=currentTime;
			}
		}
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}

	public void upgrade() {
		level++;
		if(level==2) speed=15;
		if(level==3) speed=20;
	}

}
