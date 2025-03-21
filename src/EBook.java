public class EBook extends NetBook {

    private final int characters;
    private boolean illustrated = true;

    public EBook(String title, String literatureType,int availability, int reach, int use, int characters, boolean illustrated){
        super(title,literatureType,availability,reach,use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

/*
    public double calculatePages(){
            double pages = (this.characters / 1800.0) + 20;
            if (illustrated){
                pages *= 1.1; // If the eBook is illustrated + 10%
            }
            return pages;
        }
*/

            public double calculatePages(){
             if (!illustrated){
            return (this.characters/1800.0)+20;
          } else {
             return ((this.characters/1800.0)+20) * 1.1; // If the eBook is illustrated + 10%
             }
        }



    @Override
    public double calculatePoints(){
       return this.calculatePages() * this.convertLiteratureType() * this.getPseudoCopies();
    }
}
