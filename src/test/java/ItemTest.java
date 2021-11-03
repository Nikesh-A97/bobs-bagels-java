import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void getItemId() {
        // Arrange
        Item item1 = new Item();
        Item item2 = new Item();

        // Act

        //Assert
        assertNotNull(item1.getID());
        System.out.println(item1.getID().toString());
        System.out.println(item2.getID().toString());
    }


}
