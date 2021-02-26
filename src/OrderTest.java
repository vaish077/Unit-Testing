import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void should_ReturnTrue_when_QuantityIsEqual() {
        Order order = new Order();

        order.setQuantity(10);

        assertEquals(order.getQuantity(), 10);
    }

    @Test
    void should_ReturnTrue_when_PriceIsEqual() {
        Order order = new Order();

        order.setPrice(2000);

        assertEquals(order.getPrice(), 2000);
    }

    @Test
    void should_ReturnTrue_PriceWithTexIsEqual() {
        Order order = new Order();

        order.setPriceWithTex(2020.0);

        assertEquals(order.getPriceWithTex(), 2020.0);
    }

    @Test
    void should_ReturnTrue_when_ItemIsEqual() {
        Order order = new Order();

        order.setItemName("Laptop");

        assertEquals(order.getItemName(), "Laptop");
    }

    @Test
    public void Test_Class_GetterMethods() {

        Order order = new Order(2, "Laptop", 50000.0);

        int expected_quantity = 2;
        String expected_itemName = "Laptop";
        double expected_price = 50000.0;

        assertAll(
                () -> assertEquals(expected_quantity, order.getQuantity()),
                () -> assertEquals(expected_itemName, order.getItemName()),
                () -> assertEquals(expected_price, order.getPrice())
        );

    }

    @Test
    public void Testing_Class_SetterMethods() {

        Order order = new Order();
        int actual_Quantity = 3;
        String actual_Name = "Bike";
        double actual_Price = 150000.0;
        double actual_PriceWithTax = 180000.0;
        order.setQuantity(actual_Quantity);
        order.setItemName(actual_Name);
        order.setPrice(actual_Price);
        order.setPriceWithTex(actual_PriceWithTax);

        int expected_Quantity = 3;
        String expected_Name = "Bike";
        double expected_Price = 150000.0;
        double expected_PriceWithTax = 180000.0;


        assertAll(
                () -> assertEquals(expected_Quantity, order.getQuantity()),
                () -> assertEquals(expected_Name, order.getItemName()),
                () -> assertEquals(expected_Price, order.getPrice()),
                () -> assertEquals(expected_PriceWithTax, order.getPriceWithTex())
        );
    }
}


