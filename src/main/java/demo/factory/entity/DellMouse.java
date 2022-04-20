package demo.factory.entity;

import demo.annotation.TestAnnotation;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 14:21
 * @Description:
 */
@TestAnnotation
public class DellMouse implements Mouse{
    @Override
    public void sayHi() {
        System.out.println("我是戴尔鼠标");
    }
}
