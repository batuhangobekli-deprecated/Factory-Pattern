public class PepperoniPizzza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Pep Pizza Preparing");
    }

    @Override
    public void bake() {
        System.out.println("Pep Pizza Baking");
    }

    @Override
    public void cut() {
        System.out.println("Pep Pizza Cut");
    }

    @Override
    public void box() {
        System.out.println("Pep Pizza Boxing");
    }
}
