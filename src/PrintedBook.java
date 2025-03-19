public class PrintedBook extends Title {

    // Attributes
    private int pages;

    // Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Methods
    @Override
    protected double calculatePoints() {
        double royaltyValue = convertLiteratureType();
        return pages * royaltyValue * copies;
    }
}
