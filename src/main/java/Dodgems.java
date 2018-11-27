public class Dodgems extends Attraction implements ITicketed, IReviewed {

//    Visitor visitor;

    public Dodgems(String name, int rating, double price){
        super(name, rating, price);
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.age < 12){
            return this.price /=2;
        } else {
            return this.price;
        }
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }


}
