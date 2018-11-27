public class Rollercoaster extends Attraction implements ITicketed,ISecurity {

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

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.age >= 12){
            return true;
            } else
                {
            return false;
        }
    }
}
