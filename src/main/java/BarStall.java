public class BarStall extends Stall implements ISecurity{

    public BarStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.age >= 18){
            return true;
        } else {
              return false;
             }
    }
}
