package solar;

import util.GameUtil;

import java.awt.*;

/**
 * Created by hzq on 16-10-25.
 */
public class Star {
    Image img;
    double x, y;

    public Star() {}

    public void draw(Graphics g){
        g.drawImage(img, (int)x, (int)y, null);
    }

    public Star(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public Star(String imgPath, double x, double y) {
        this.img = GameUtil.getImage(imgPath);
        this.x = x;
        this.y = y;
    }
}
