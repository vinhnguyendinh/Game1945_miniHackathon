import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by VinhNguyenDinh on 03/05/2016.
 */
public abstract class Plane extends PlaneAbstract {
    protected int direction;

    public Plane(int x, int y, int speed, int planeType) {
        super(x, y, speed, planeType);
        switch (planeType) {
            case 1:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PLANE1.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PLANE2.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PLANE3.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    this.sprite = ImageIO.read(new File("Resources/PLANE4.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
