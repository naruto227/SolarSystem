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

    boolean satellite;  //判断是否为卫星

    public void draw(Graphics g) {
//        g.drawImage(img, (int) x, (int) y, null);
        super.draw(g);
        move();
        if(!satellite){
            drawTrace(g);
        }
    }

    public void move() {
        //沿着椭圆轨迹飞行
        x = center.x + center.width / 2 + longAxis * Math.cos(degree);
        y = center.y + center.height / 2 + shortAxis * Math.sin(degree);

        degree += speed;
    }

    public void drawTrace(Graphics g) {
        double _x, _y, _width, _height; //shift+F6 Refactor 变量全部重命名

        _width = longAxis * 2;
        _height = shortAxis * 2;
        _x = center.x + center.width / 2 - longAxis;
        _y = center.y + center.height / 2 - shortAxis;
        Color c = g.getColor();
        g.setColor(Color.blue);
        g.drawOval((int)_x, (int)_y, (int)_width, (int)_height);
        g.setColor(c);
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

    public Planet(String imgPath, Star center, double longAxis, double shortAxis, double speed, boolean satellite) {
        this(imgPath,center,longAxis,shortAxis,speed);
        this.satellite = satellite;
    }

    public Planet(Image img, double x, double y) {
        super(img, x, y);   //调用父类构造器
    }

    public Planet(String imgPath, double x, double y) {
        super(imgPath, x, y);
    }
}
