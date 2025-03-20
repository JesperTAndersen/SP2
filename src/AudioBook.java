public class AudioBook extends PhysicalBook implements IAudioBook{
    private final int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints(){
        return (this.durationInMinutes*0.5) * convertLiteratureType() * copies;
    }
}
