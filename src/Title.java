public abstract class Title {
    private String title;
    protected String literatureType;
    private static final double pointRate = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    protected abstract double calculatePoints();

    public double calculateRoyalty(){
        // Rate as of 2025
        return calculatePoints() * pointRate;
    }

    protected double convertLiteratureType(){
        double royaltyValue = switch (this.literatureType) {
            case "BI" -> 3.0;
            case "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 0.0;
        };
        return royaltyValue;
    }

}
