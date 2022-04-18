package generic;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/18 14:19
 * @Description:
 */
public interface GenericFactory<T,N> {
    T getObject();
    N getSomething();
}
