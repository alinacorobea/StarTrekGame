package com.game;

public class Projectile extends Entity {

	protected int damage;
	protected Entity owner;
	
	public Projectile(StarTrek ref, Entity owner, int x, int y, int width, int height, int health, Side side) {
		super(ref, x, y, width, height, health);
		this.owner = owner;
		this.side = side;
	}

	public void hasCollided(Entity other) {
		if (other.side != side) {
			other.hit(damage);
			this.destroy();
		}
	}

}
