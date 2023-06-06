
public class Pizza {
    private int Price;
    private Boolean Veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isoptedTakeAway = false;
    public Pizza(Boolean veg) {
        this.Veg = veg;
        if (this.Veg) {
            this.Price = 300;
            
        }  else {
            this.Price = 400;
        }
        basePizzaPrice = this.Price;
    }
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.Price += extraCheesePrice;
    } 
    
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
       
        this.Price += extraToppingsPrice;


    }
    public void takeAway() {
        isoptedTakeAway = true;
        System.out.println("Take away opted");
        this.Price += backPackPrice;

    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza:"+basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill +="Extra cheese added: "+extraCheesePrice+ "\n";

        }
        if(isExtraToppingsAdded)  {
            bill += "Extra Toppings added: "+extraToppingsPrice+ "\n";
        }
        if(isoptedTakeAway) {
            bill += "Take away: "+backPackPrice+ "\n";
        }
        bill +="Bill: "+this.Price + "\n";
        System.out.println(bill);
    }
}