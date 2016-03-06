import java.awt.*;
import java.util.Vector;

/**
 * Created by VinhNguyenDinh on 03/05/2016.
 */
public abstract class PlaneAbstract extends GameObject {
    protected int health;
    protected int damage;
    protected int planeType;
    Vector<Bullet> vectorBullet = new Vector<>();

    public PlaneAbstract(int x, int y, int speed, int planeType) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.planeType = planeType;
    }

    public void update() {
        for(Bullet bullet : vectorBullet) {
            bullet.update();
        }
    }

    public void shot(int speed, int bulletType) {
        Bullet bullet = new Bullet(x + 30, y, speed, bulletType);
        vectorBullet.add(bullet);
    }

    public void draw(Graphics g) {
        super.draw(g);
        for(Bullet bullet : vectorBullet) {
            bullet.draw(g);
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
