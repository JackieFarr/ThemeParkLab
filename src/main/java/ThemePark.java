import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviews;
    private String name;


    public ThemePark(String name, ArrayList reviews) {
        this.name = name;
        this.reviews = reviews;
    }

//    public int reviewCount() {
//        return this.getAllReviews().size();
//    }

    public ArrayList getAllReviews() {
        return this.reviews;
    }

    public void addReview(IReviewed review){
        this.reviews.add(review);
    }

}