public class HamburgerMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("chuan bi");
    }

    @Override
    public void cook() {
        System.out.println("dang nau");
    }

    @Override
    public void cleanUp() {
        System.out.println("don dep");
    }
}
