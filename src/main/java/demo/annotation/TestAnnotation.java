package demo.annotation;

import java.lang.annotation.*;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/20 09:08
 * @Description:
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Documented
@Inherited
public @interface TestAnnotation {
}
