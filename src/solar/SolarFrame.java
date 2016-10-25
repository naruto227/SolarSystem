package solar;

import util.Constant;
import util.GameUtil;
import util.MyFrame;

import java.awt.*;

/**
 * 太阳系的主窗口
 * Created by hzq on 16-10-25.
 */
public class SolarFrame extends MyFrame {
    Image bg = GameUtil.getImage("images/bg.jpg");
//    Image bg1 = GameUtil.getImage("images/sun.jpg");

    Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH / 2, Constant.GAME_HEIGHT / 2);
    Planet earth = new Planet("images/Earth.jpg", sun, 150, 100, 0.1);

    public void paint(Graphics g) { //paint()方法
        g.drawImage(bg, 0, 0, null);
//        g.drawImage(bg1, 50, 50, null);
        sun.draw(g);
        earth.draw(g);
    }

    public static void main(String[] args) {
        new SolarFrame().launchFrame();
    }
}
