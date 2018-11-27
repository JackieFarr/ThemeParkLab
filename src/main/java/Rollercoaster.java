public class Rollercoaster extends Attraction implements ITicketed {

    public Rollercoaster(String name, int rating, double price){
        super(name, rating, price);
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.height >= 200) {
            return this.price * 2;
            } else
             {
             return this.price;
         }
    }
}
