package logic;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> orderItemList;
    private static int totalOrderCount = 0;
    private int orderNumber;

    public Order() {
        // TODO
        orderItemList = new ArrayList<>();
        setOrderNumber(totalOrderCount + 1);
        setTotalOrderCount(1);
        setOrderNumber(0);
    }


    public OrderItem addItem(Item item, int amount) {
        // TODO
        // Loop the orderItemList to find if item of any orderItem equals to the given item
        // if there is orderItem with given item, increase that orderItem itemAmount with amount
        // and return that orderItem

        // else create new orderItem with given item and amount, then return the new orderItem
        boolean check = false;
        for (OrderItem findItem : orderItemList) {
            if (findItem.getItem().getName().equals(item.getName())) {
                findItem.increaseItemAmount(amount);
                check = true;
            }
        }
        if(!check)
            orderItemList.add(new OrderItem(item , amount));

        return new OrderItem(item, amount);
    }

    public int calculateOrderTotalPrice() {
        // TODO
        // Calculate total price of the order by summing total price of each orderItem in orderItemList
        int total = 0;
        for (OrderItem eachItem : orderItemList) {
            total += (eachItem.getItemAmount() * eachItem.getItem().getPricePerPiece());
        }
        return total;
    }

    public static int getTotalOrderCount() {
        return totalOrderCount;
    }

    public static void resetTotalOrderCount() {
        totalOrderCount = 0;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public static void setTotalOrderCount(int totalOrderCount) {
        Order.totalOrderCount = totalOrderCount;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
