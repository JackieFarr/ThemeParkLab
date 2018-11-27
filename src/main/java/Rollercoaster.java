public class Rollercoaster extends Attraction implements ITicketed {

    public Rollercoaster(String name, int rating, double price){
        super(name, rating, price);
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        return this.price;
    };
}
