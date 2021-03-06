package com.game;

import java.awt.*;

public class Bullet extends Projectile {
	
	public Bullet(StarTrek ref, Entity owner, int x, int y, int width, int height, Side side) {
		super(ref, owner, x, y, width, height, 1, side);
		this.damage = 50;
	}
	
	public void draw(Graphics2D g) {
		g.setColor(new Color(225, 225, 80));
		g.fillOval(x,  y, w, h);
	}
}
