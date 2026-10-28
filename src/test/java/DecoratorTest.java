import com.homework_8.decorator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testburger() {
        FoodItems burger = new Burger();
        double expected = 5.35;
        double actual = burger.getCost();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testburgerWithCheese() {
        FoodItems burger = new Cheese(new Burger());
        double expected = 6.35;
        double actual = burger.getCost();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testOrderTotal() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Fries());
        assertEquals(7.85, order.getTotalCost(), 0.001);
    }

    @Test
    public void testMultipleToppings() {
        FoodItems burger = new Burger();
        burger = new Ketchup(burger);
        burger = new Onions(burger);
        double expected = 7.05;
        double actual = burger.getCost();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSilveriscount() {
        Loyalty customer = new Loyalty("Silver");
        double expected = 98.00;
        double actual = customer.applyDiscount(100.00);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testEmptyOrder() {
        Order order = new Order();
        double expected = 0.0;
        double actual = order.getTotalCost();
        assertEquals(expected, actual, 0.001);
    }

}
