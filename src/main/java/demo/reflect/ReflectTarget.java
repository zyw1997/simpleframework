package demo.reflect;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/19 15:24
 * @Description:
 */
public class ReflectTarget extends ReflectTargetOrigin {
    public String name;
    protected int index;
    char info;
    private String id;

    public void show1(String s) {
        System.out.println("调用public的String参数的show1(),s:" + s);
    }

    protected void show2() {
        System.out.println("调用protect的无参show2()");
    }

    void show3() {
        System.out.println("调用default的无参show3()");
    }

    private String show4(String s) {
        System.out.println("调用private的参数为String的show4(),s:" + s);
        return "Hello " + s;
    }

    @Override
    public String toString() {
        return "ReflectTarget{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", info=" + info +
                ", id='" + id + '\'' +
                '}';
    }

    ReflectTarget(String name) {
        System.out.println("默认类型构造函数：" + name);
    }

    public ReflectTarget() {
        System.out.println("公开的构造函数");
    }

    public ReflectTarget(String name, int index) {
        System.out.println("公开的构造函数，name:" + name + "index:" + index);
    }

    public ReflectTarget(long index) {
        System.out.println("公开的构造函数，index:" + index);
    }

    private ReflectTarget(String name, String name1) {
        System.out.println("私有类型构造函数：name" + name + "name1:" + name1);
    }


    protected ReflectTarget(int index, String name) {
        System.out.println("受保护的构造函数，name:" + name + "index:" + index);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("Class1名称:" + reflectTargetClass1.getName());
        Class reflectTargetClass2 = ReflectTarget.class;
        System.out.println("Class2名称:" + reflectTargetClass2.getName());
        System.out.println(reflectTargetClass1 == reflectTargetClass2);
        Class reflectTargetClass3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("Class3名称:" + reflectTargetClass3.getName());
        System.out.println(reflectTargetClass3 == reflectTargetClass2);
    }
}
