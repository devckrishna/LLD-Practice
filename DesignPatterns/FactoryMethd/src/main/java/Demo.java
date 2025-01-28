import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Course hld = CourseFactory.getCourse("HLD");
        Course lld = CourseFactory.getCourse("LLD");


        System.out.println("HLD Modules");
        System.out.println(hld.modules);

        System.out.println("LLD Modules");
        System.out.println(lld.modules);
    }
}
