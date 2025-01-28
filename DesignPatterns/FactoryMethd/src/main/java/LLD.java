public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new DemoModule());
        modules.add(new ConceptModule());
    }
}
