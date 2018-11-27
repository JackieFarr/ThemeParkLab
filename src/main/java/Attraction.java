public abstract class Attraction {

    String name;
    int rating;
    double price;

    public Attraction(String name, int rating, double price){
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

    public double getPrice(){
        return this.price;
    }
}
