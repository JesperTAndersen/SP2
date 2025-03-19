public class AudioBook extends Title{

    // Attributes
    private int durationInMinutes;

    // Constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }


    // Methods
    @Override
    protected double calculatePoints(){
        double royaltyValue = convertLiteratureType();
        return (this.durationInMinutes*0.5) * royaltyValue * copies;
    }



}
