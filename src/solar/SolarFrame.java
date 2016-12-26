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

    Star sun = new Star("images/sun.jpg", Constant.GAME_WIDTH / 2, Constant.GAME_HEIGHT / 2);   //对象的属性初始化,太阳

    Planet mercury = new Planet("images/Mercury.jpg", sun, 50, 40, 0.008); //水星绕太阳转
    Planet venus = new Planet("images/Venus.jpg", sun, 65, 55, 0.01); //金星绕太阳转

    Planet earth = new Planet("images/Earth.jpg", sun, 90, 80, 0.015); //地球
    Planet moon = new Planet("images/moon.jpg", earth, 18, 16, 0.06, true);  //月亮

    Planet mars = new Planet("images/Mars.jpg", sun, 120, 100, 0.02);   //火星
    Planet jupiter = new Planet("images/Jupiter.jpg", sun, 140, 120, 0.025);   //木星

    Planet satrun = new Planet("images/Saturn.jpg", sun, 160, 130, 0.03);   //土星
    Planet uranus = new Planet("images/Uranus.jpg", sun, 180, 150, 0.035);   //天王星

    Planet neptune = new Planet("images/Neptune.jpg", sun, 210, 165, 0.04);   //海王星


    public void paint(Graphics g) { //paint()方法
        g.drawImage(bg, 0, 0, null);
//        g.drawImage(bg1, 50, 50, null);
        sun.draw(g);//画太阳

        mercury.draw(g);
        venus.draw(g);

        earth.draw(g);
        moon.draw(g);

        mars.draw(g);
        jupiter.draw(g);

        satrun.draw(g);
        uranus.draw(g);

        neptune.draw(g);
    }

    public static void main(String[] args) {
        new SolarFrame().launchFrame();
    }
}
