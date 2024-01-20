package logic;

public class Item {
    //name of item is diff and not null Otherwise will error
    //price if less than 1 set 1 (Math.max)
    private String name;
    private int pricePerPiece;

    public Item(String name, int pricePerPiece){
        setName(name);
        setPricePerPiece(pricePerPiece);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(int pricePerPiece) {
        this.pricePerPiece = Math.max(1,pricePerPiece);
    }
}
