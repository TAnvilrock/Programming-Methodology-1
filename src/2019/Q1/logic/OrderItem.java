package logic;

import java.security.PublicKey;

public class OrderItem {
    private Item item;
    private int itemAmount;

    public OrderItem(Item item, int itemAmount) {
        setItem(item);
        setItemAmount(itemAmount);
    }

    public void increaseItemAmount(int amount) {
        setItemAmount(getItemAmount() + Math.max(0, amount));
    }

    public int calculateTotalPrice() {
        return getItemAmount() * getItem().getPricePerPiece();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = Math.max(0, itemAmount);
    }
}
