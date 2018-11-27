public class CandyFlossStall extends Stall implements IReviewed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot,int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }
}
