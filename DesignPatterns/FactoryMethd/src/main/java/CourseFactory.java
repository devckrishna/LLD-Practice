public class CourseFactory {
    public static Course getCourse(String courseName) {
        switch (courseName) {
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
}
