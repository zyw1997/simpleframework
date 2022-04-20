package demo.factory.simple;

import demo.factory.entity.DellMouse;
import demo.factory.entity.HpMouse;
import demo.factory.entity.Mouse;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 14:22
 * @Description:简单工厂模式
 */
public class MouseFactory {
    public static Mouse createMouse(int type) {
        switch (type) {
            case 0:
                return new DellMouse();
            case 1:
                return new HpMouse();
            default:
                return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
