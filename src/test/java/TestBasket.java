import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBasket {

    Item[] testItems = {new Item(), new Item(), new Item(), new Item()};
    Basket testBasket;

    @BeforeEach
    public void beforeEach() {
        // Anything in here will always be executed before each test
        testBasket = new Basket();
    }

    @AfterEach
    public void afterEach() {
        // Anything in here will always be executed after each test
        testBasket = null;
    }

    @Test
    public void addingItemToBasket() {
        // Arrange

        // Act
        boolean result = testBasket.addItem(testItems[0]);

        // Assert
        assertTrue(result);

    }

}
