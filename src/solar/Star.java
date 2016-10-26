package solar;

import util.GameUtil;

import java.awt.*;

/**
 * Created by hzq on 16-10-25.
 */
public class Star {
    Image img;
    double x, y;
    int width, height;

    public Star() {
    }

    public void draw(Graphics g) {
        g.drawImage(img, (int) x, (int) y, null);
    }

    public Star(Image img) {
        this.img = img;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public Star(Image img, double x, double y) {
//        this.img = img;
        this(img);
        this.x = x;
        this.y = y;
        /*this.width = img.getWidth(null);
        this.height = img.getHeight(null);*/
    }

    public Star(String imgPath, double x, double y) {
        /*this.img = GameUtil.getImage(imgPath);
        this.x = x;
        this.y = y;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);*/
        this(GameUtil.getImage(imgPath), x, y); //通过this调用另一个构造器
    }
}
