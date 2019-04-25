package sharedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;


public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();

	private List<IRenderable> entities;
	private Comparator<IRenderable> comparator;
	public static Image redTank1;
	public static Image redTank2;
	public static Image redTank3;
	public static Image greenTank1;
	public static Image greenank2;
	public static Image greenTank3;
	public static Image blueTank1;
	public static Image blueTank2;
	public static Image blueTank3;
	public static Image sandTank1;
	public static Image sandTank2;
	public static Image sandTank3;
	public static Image redShip1;
	public static Image redShip2;
	public static Image redShip3;
	public static Image grrenShip1;
	public static Image greenShip2;
	public static Image greenShip3;
	public static Image blueShip1;
	public static Image blueShip2;
	public static Image blueShip3;
	public static Image whiteShip1;
	public static Image whiteShip2;
	public static Image whiteShip3;
	
	

	static {
		loadResource();
	}

	public RenderableHolder() {
		entities = new ArrayList<IRenderable>();
		comparator = (IRenderable o1, IRenderable o2) -> {
			if (o1.getZ() > o2.getZ())
				return 1;
			return -1;
		};
	}

	public static RenderableHolder getInstance() {
		return instance;
	}

	public static void loadResource() {
		
	}

	public void add(IRenderable entity) {
		System.out.println("add");
		entities.add(entity);
		Collections.sort(entities, comparator);
	}

	public void update() {
		for (int i = entities.size() - 1; i >= 0; i--) {
			if (entities.get(i).isDestroyed())
				entities.remove(i);
		}
	}

	public List<IRenderable> getEntities() {
		return entities;
	}
}
