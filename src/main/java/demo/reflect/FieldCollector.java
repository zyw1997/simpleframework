package demo.reflect;

import java.lang.reflect.Field;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 19:50
 * @Description:
 */
public class FieldCollector {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("demo.reflect.ReflectTarget");
        Field[] fields = clazz.getFields();
        System.out.println("**********所有public修饰的field(包括继承的属性)*********");
        for (Field f :
                fields) {
            System.out.println(f);
        }
        fields = clazz.getDeclaredFields();
        System.out.println("**********所有声明的field(不包括继承的属性)*********");
        for (Field f :
                fields) {
            System.out.println(f);
        }
        ReflectTarget reflectTarget = (ReflectTarget) clazz.getConstructor().newInstance();

        System.out.println("**********根据Field名获取public的field(包括继承的属性)*********");
        Field f = clazz.getField("name");
        f.set(reflectTarget, "反射属性一号");
        System.out.println("反射：" + reflectTarget.name);

        System.out.println("**********根据Field名获取声明的field(不包括继承的属性)*********");
        f = clazz.getDeclaredField("id");
        f.setAccessible(true);
        f.set(reflectTarget, "反射属性二号");
        System.out.println("反射：" + reflectTarget);
    }
}
