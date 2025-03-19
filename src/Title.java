public abstract class Title {
    private String title;
    protected String literatureType;
    private int literatureTypePoints;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    protected abstract double calculatePoints();

    public double calculateRoyalty(){
        double pointRate = 0.067574;
        double value = calculatePoints() * pointRate;
        return value;
    }

    protected double convertLiteratureType(){
        double royaltyValue = 0.0;
        switch (this.literatureType) {
            case "BI":
                royaltyValue = 3.0;
                break;
            case "TE":
                royaltyValue = 3.0;
                break;
            case "LYRIK":
                royaltyValue = 6.0;
                break;
            case "SKØN":
                royaltyValue = 1.7;
                break;
            case "FAG":
                royaltyValue = 1.0;
                break;
        }
        return royaltyValue;
    }




}
