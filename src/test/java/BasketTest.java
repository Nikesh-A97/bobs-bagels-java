import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    Item testItem;
    Basket testBasket;

    @BeforeEach
    public void beforeEach() {
        testBasket = new Basket();
        testItem = new Item();
    }

    @AfterEach
    public void afterEach() {
        testItem = null;
        testBasket = null;
    }

    @Test
    public void addItemCheckItemTest() {

        testBasket.addItem(testItem);
        boolean result = testBasket.getBasketContents()[0].equals(testItem);

        assertTrue(result);
    }

    @Test
    public  void  addTwoItemsTest() {
        Item testItem2 = new Item();

        testBasket.addItem(testItem);
        testBasket.addItem(testItem2);

        boolean result1 = testBasket.getBasketContents()[1].equals(testItem2);
        boolean result2 = testBasket.getBasketContents()[0].equals(testItem);

        assertTrue(result1);
        assertTrue(result2);
    }

    @Test
    public void removeItemTest() {
        // Arrange
        testBasket.addItem(testItem);

        // Act
        testBasket.removeItem(testItem);

        // Assert
        assertNull(testBasket.getBasketContents()[0]);
    }

    @Test
    public void removeItemFromAnyPositionInBasket() {
        // Arrange
        Item testItem2 = new Item();

        testBasket.addItem(testItem);
        testBasket.addItem(testItem2);

        // Act
        testBasket.removeItem(testItem2);

        // Assert
        assertNull(testBasket.getBasketContents()[1]);

    }

    @Test
    public void removeItemNotInBasketTest() {
        Item testItem4 = new Item();
        testBasket.addItem(testItem);
        boolean result = testBasket.removeItem(testItem4);
        assertFalse(result);
    }

    @Test
    public void checkBasketIsFullBeyondCapacity() {
        // Arrange
        Item testItem1 = new Item();
        Item testItem2 = new Item();
        Item testItem3 = new Item();
        Item testItem4 = new Item();

        testBasket.addItem(testItem1);
        testBasket.addItem(testItem2);
        testBasket.addItem(testItem3);

        // Act
        testBasket.addItem(testItem4);

        // Assert
//        boolean result = testBasket.isBasketFull();
//        assertEquals(true, result);
    }


}
