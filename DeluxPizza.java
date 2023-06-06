public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean Veg) {
        super(Veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}