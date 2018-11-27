public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating, double price){
        super(name, rating, price);
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }
}
