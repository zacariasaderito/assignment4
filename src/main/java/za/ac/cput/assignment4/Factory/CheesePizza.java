package za.ac.cput.assignment4.Factory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza...");

    }
}
