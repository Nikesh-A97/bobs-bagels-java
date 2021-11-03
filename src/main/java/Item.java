import java.util.UUID;

public class Item {
    private UUID itemID;

    public Item() {
        this.itemID = UUID.randomUUID();
    }

    public UUID getID() {
        return this.itemID;
    }
}
