package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 15:32
 * @Description:
 */
public class ConstructorCollector {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class reflectTargetClass = Class.forName("demo.reflect.ReflectTarget");
        Constructor[] constructors = reflectTargetClass.getConstructors();
        System.out.println("************所有公共构造函数**************");
        for (Constructor c : constructors
        ) {
            System.out.println(c);
        }
        constructors = reflectTargetClass.getDeclaredConstructors();
        System.out.println("************所有公共、私有、受保护、默认构造函数**************");
        for (Constructor c : constructors
        ) {
            System.out.println(c);
        }
        System.out.println("************特定参数的公共构造函数**************");
        Constructor constructor = reflectTargetClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        System.out.println("************特定参数的声明构造函数**************");
        constructor = reflectTargetClass.getDeclaredConstructor(String.class,String.class);
        System.out.println(constructor);
        System.out.println("************通过私有构造函数创建实例对象**************");
        constructor.setAccessible(true);
        ReflectTarget reflectTarget = (ReflectTarget) constructor.newInstance("123","123");

    }
}
