package solar;

import util.GameUtil;

import java.awt.*;

/**
 * Created by hzq on 16-10-25.
 */
public class Planet extends Star {
    //除了图片，坐标。行星沿着某个椭圆运行：长轴、短轴、速度、角度。绕着某个Star飞。

    double longAxis;    //椭圆的长轴
    double shortAxis;   //椭圆的短轴
    double speed;       //飞行的速度
    double degree;      //飞行的角度
    Star center;

    public void draw(Graphics g) {
        g.drawImage(img, (int) x, (int) y, null);

        //沿着椭圆轨迹飞行
        x = center.x + center.width / 2 + longAxis * Math.cos(degree);
        y = center.y + center.height / 2 + shortAxis * Math.sin(degree);

        degree += speed;
    }

    /**
     * 封装需要的属性
     */
    public Planet(String imgPath, Star center, double longAxis, double shortAxis, double speed) {

        super(GameUtil.getImage(imgPath));  //调用父类构造器，得到图片宽度、高度
        this.center = center;
        this.x = center.x + longAxis;
        this.y = center.y;
        this.img = GameUtil.getImage(imgPath);
        this.longAxis = longAxis;
        this.shortAxis = shortAxis;
        this.speed = speed;
    }

    public Planet(Image img, double x, double y) {
        super(img, x, y);   //调用父类构造器
    }

    public Planet(String imgPath, double x, double y) {
        super(imgPath, x, y);
    }
}
