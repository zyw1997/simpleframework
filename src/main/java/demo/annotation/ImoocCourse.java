package demo.annotation;

/**
 * @Auther: zhengyiwen
 * @Date: 2022/4/20 09:34
 * @Description:
 */
@CourseInfoAnnotation(courseName = "Spring源码轻松学 一课覆盖Spring核心知识点", courseTag = "实战",
        courseProfile = "剑指Java自研框架，决胜Spring源码" +
                "提升面试的成功率和工作的效率，让你写出趋近于框架级的代码")
public class ImoocCourse {
    @PersonInfoAnnotation(name = "翔仔", devLanguage = {"java", "C++", "Go"})
    private String author;

    @CourseInfoAnnotation(courseName = "测试课程", courseTag = "测试",
            courseProfile = "测试测测测试", courseIndex = 101)
    public void getCourseInfo() {
    }

}
