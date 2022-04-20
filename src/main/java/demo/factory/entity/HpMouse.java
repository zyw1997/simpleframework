package demo.factory.entity;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 14:21
 * @Description:
 */
public class HpMouse implements Mouse {
    @Override
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }
}
