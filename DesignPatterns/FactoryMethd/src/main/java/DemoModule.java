public class DemoModule extends Module{
    public DemoModule() {
        this.name = "Demo";
    }
    @Override
    public String printModuleName() {
        return this.name;
    }
}
