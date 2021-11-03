public class Basket {

    private Item[] basketContents = new Item[3];

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
}
