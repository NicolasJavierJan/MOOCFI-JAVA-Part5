
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.totalPrice = this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int difference = this.totalPrice - compared.totalPrice;
        if (difference < 0){
            return difference * -1;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.totalPrice > compared.totalPrice){
            return true;
        }
        return false;
    }
}
