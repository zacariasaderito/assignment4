package za.ac.cput.assignment4.Factory;

public class PizzaFactory {

    public static Pizza createPizza(String type)
    {
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (type.equals("meat"))
        {
            pizza = new MeatPizza();
        }
        else if (type.equals("veg"))
        {
            pizza = new VegPizza();
        }else
        {
            pizza = null;
        }


        return pizza;
    }
}
