package demo.reflect;

import java.lang.reflect.Method;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 20:12
 * @Description:
 */
public class MethodCollector {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("demo.reflect.ReflectTarget");

        System.out.println("**********所有public修饰的method(包括继承的method)*********");
        Method[] methods = clazz.getMethods();
        for (Method m :
                methods) {
            System.out.println(m);
        }
        System.out.println("**********所有声明的method(不包括继承的method)*********");
        methods = clazz.getDeclaredMethods();
        for (Method m :
                methods) {
            System.out.println(m);
        }
        ReflectTarget reflectTarget = (ReflectTarget) clazz.newInstance();
        System.out.println("**********根据method名与参数列表获取public修饰的method(包括继承的method)*********");
        Method m = clazz.getMethod("show1", String.class);
        System.out.println(m);
        m.invoke(reflectTarget, "123");

        System.out.println("**********根据method名与参数列表获取声明的method(不包括继承的method)*********");
        m = clazz.getDeclaredMethod("show4", String.class);
        System.out.println(m);
        m.setAccessible(true);
        String s = (String) m.invoke(reflectTarget, "123");
        System.out.println("调用声明方法获取到的返回值:" + s);
    }
}
