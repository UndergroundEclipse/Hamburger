class Hamburger{

    private double basePrice = 4.99;
    private breadType breadType;
    private meatType meatType;
    private double totalPrice;
    private int additions = 0;

    public Hamburger(breadType breadType, meatType meatType, double totalPrice) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.totalPrice = totalPrice;
    }

    public breadType getBreadType() {
        return breadType;
    }

    public meatType getMeatType() {
        return meatType;
    }

    public double getTotalPrice() {

        totalPrice = totalPrice + meatType.getMeatPrice() + breadType.getBreadPrice(); //the total price + add additions is taken into account
        return totalPrice; // in the actual add Additions method
    }

    public double getBasePrice(){
        return basePrice;
    }

    public double addAdditions(String burgerExtras) {
        double additionPrice = 0.50;
        if (this.additions >= 0 && this.additions <= 4) {
            additions++;
            System.out.println("You've added " + burgerExtras);
            totalPrice = totalPrice + additionPrice;
        }

        else System.out.println("Your burger is going to explode. You can't add any more additions");

        return totalPrice;

    }
}

class HealthyBurger extends Hamburger {
    public HealthyBurger(breadType breadType, meatType meatType, double totalPrice, int healthyAdditions) {
        super(breadType, meatType, totalPrice);
    }

    @Override
    public double addAdditions(String burgerExtras) {
        double additions = super.addAdditions(burgerExtras);
        if(additions >= 0 && additions <=6){
            additions++;
            System.out.println("You've added " + additions + " addition(s). " + burgerExtras + " is great on the Healthy Burger. Good choice");
        }

        else System.out.println("You're burger is going to explode. You can't add anything else");
        double additionsWithHealthyAdditionsPrice = additions*0.50;

        double healthyBurgerTotalPrice = getTotalPrice();
        healthyBurgerTotalPrice = healthyBurgerTotalPrice + additionsWithHealthyAdditionsPrice;

        return healthyBurgerTotalPrice;
    }
}

class DeluxeBurger extends Hamburger{
    public DeluxeBurger(breadType breadType, meatType meatType, double totalPrice) {
        super(breadType, meatType, totalPrice);
    }


    public double friesAndADrink(String fryType, String sodaType){

        double costOfFries = 1.25;
        double costOfSoda = .75;

        double deluxeAdditionsPrice = getTotalPrice();
        deluxeAdditionsPrice = deluxeAdditionsPrice + costOfFries + costOfSoda;

        System.out.println("All together that comes to a total of " + deluxeAdditionsPrice + ". Cash or credit?");

        return deluxeAdditionsPrice;
    }
}

class Main{
    public static void main(String[] args) {
        breadType Whole = new breadType("Whole");
        
        DeluxeBurger Morgans = new DeluxeBurger("Whole", "Beef", 5.0);
    }
}
