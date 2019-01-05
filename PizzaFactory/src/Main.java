public class Main {
    public static void main(String[] args) {
        WashingTonPizzaFactory washingTonPizzaFactory = new WashingTonPizzaFactory();
        PizzaStore pizzaStore = new WashingTonPizzaFactory();
        pizzaStore.orderPizza("cheese");
        NYPizzaIngredientFactory as = new NYPizzaIngredientFactory();
        as.createCheese();
        as.createCheese()
        Pizza pizza = new CheesePizza(as);

    }

}
