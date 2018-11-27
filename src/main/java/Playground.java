public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating, double price){
        super(name, rating, price);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.age > 15){
            return false;
        } else {
            return true;
        }
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }
}
