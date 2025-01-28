public class HLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new ConceptModule());
        modules.add(new SummaryModule());
    }
}
