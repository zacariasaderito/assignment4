package za.ac.cput.assignment4;

import za.ac.cput.assignment4.Factory.Pizza;
import za.ac.cput.assignment4.Factory.PizzaFactory;

public class PizzaStore {

    public Pizza orderPizza(String type)
    {
        if ((type != "veg") || (type != "meat") || (type != "cheese"))  {

        }
        Pizza pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }

}
