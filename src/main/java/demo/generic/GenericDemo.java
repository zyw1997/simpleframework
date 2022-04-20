package demo.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:09
 * @Description:
 */
public class GenericDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("123");
        list.add(123);
        list.add(new Object());
        for (Object o :list) {
            System.out.println(o.toString());
        }
    }
}
