/**
 * Created by VinhNguyenDinh on 03/06/2016.
 */
public class PlaneEnemy_1 extends PlaneEnemyAbstract {
    private int rotation = 0;
    public PlaneEnemy_1(int x, int y, int speed, int planeType) {
        super(x, y, speed, planeType);
    }

    public void move() {
        rotation++;
        this.x += Math.cos(rotation * 0.09);
        this.y += Math.sin(rotation * 0.09);
    }

    public void update() {

    }
}
