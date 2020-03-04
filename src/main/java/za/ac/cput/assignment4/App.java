package za.ac.cput.assignment4;

import java.util.Scanner;


public class App 
{
    public static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        PizzaStore pizzaStore = new PizzaStore();
        String pizza;

        pizza = input.next();
        pizzaStore.orderPizza(pizza);

    }

}
