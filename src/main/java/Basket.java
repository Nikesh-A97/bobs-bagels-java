public class Basket {

    private int basketSize;

    private Item[] basketContents;

    public Basket() {
        this.basketSize = 3;
        this.basketContents = new Item[basketSize];
    }

    public Basket(int basketSize){
        this.basketSize = basketSize;
        this.basketContents = new Item[basketSize];
    }

    public void addItem(Item newItem) {

        for(int i = 0, j = this.basketContents.length; i < j; i++) {
            if(this.basketContents[i] == null) {
                this.basketContents[i] = newItem;
                return;
            }
        }

        System.out.println("Basket is over capacity cannot add item");

    }

    public Item[] getBasketContents() {
        return this.basketContents;
    }

    public boolean removeItem(Item itemToRemove) {
        for (int i = 0, j = this.basketContents.length; i < j; i++) {
            try {
                if (this.basketContents[i].equals(itemToRemove)) {
                    this.basketContents[i] = null;
                    return true;
                }
            } catch (NullPointerException nullPointerException) {
                return false;
            }
        }
        return false;
    }

    public boolean isBasketFull() {

        return false;
    }

    public int getBasketSize() {
        return basketSize;
    }
}
