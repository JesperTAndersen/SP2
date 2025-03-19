import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author (String name){
        this.name = name;
    }

    public void addTitle(Title title){
        this.titles.add(title);
    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title t : titles){
            if ( t instanceof AudioBook ab) {
                totalPay += ab.calculateRoyalty();

            } else if ( t instanceof PrintedBook pb){
                totalPay += pb.calculateRoyalty();
            }
        }
        return totalPay;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return name + ": " + calculateTotalPay() + "kr";

    }
}
