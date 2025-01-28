import java.util.List;
public abstract class Course {
    protected List<Module> modules;

    public List<Module> getModules() {
        return modules;
    }

    public abstract void createCourse();
}
