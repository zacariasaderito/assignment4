package za.ac.cput.assignment4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment4.Factory.Pizza;

import static org.junit.Assert.*;

public class PizzaStoreTest {
    private PizzaStore pizzaStore;
    private Pizza pizza1, pizza2;

    @Before
    public void setUp() throws Exception {
        pizzaStore = new PizzaStore();
    }

    @Test
    public void TestPizzaType() {
        pizza1 = pizzaStore.orderPizza("meat");
        pizza2 = pizzaStore.orderPizza("meat");
        Assert.assertEquals(pizza1.getClass(), pizza2.getClass());
    }

    @Test
    public void TestPizza() {
        pizza1 = pizzaStore.orderPizza("cheese");
        pizza2 = pizzaStore.orderPizza("meat");
        Assert.assertNotSame(pizza1, pizza2);
    }

    @Test
    public void TestWrongInput() {
        pizza1 = pizzaStore.orderPizza("sdad");
//        pizza2 = pizzaStore.orderPizza("dasad");
        Assert.assertNotNull(pizza1);
//        Assert.assertEquals(pizza1(), pizza2.getClass());
    }

    @After
    public void tearDown() throws Exception {
    }
}