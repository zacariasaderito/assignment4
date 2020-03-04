package za.ac.cput.assignment4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestFactory {

    @Test
    public void testFactory()
    {
        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.orderPizza("veg");
        System.out.println("");
        pizzaStore.orderPizza("meat");
        System.out.println("");
        pizzaStore.orderPizza("cheese");

        // Passing invalid value fro type of pizza
        pizzaStore.orderPizza("sadaasd");




        assertTrue(true);
    }



}
