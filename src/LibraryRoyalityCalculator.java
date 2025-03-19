public class LibraryRoyalityCalculator {

    public static void main(String[] args) {
        Author a1 = new Author("Jens");

        a1.addTitle(new AudioBook("Bog1","TE",100, 300));
        a1.addTitle(new PrintedBook("Bog2","FAG",100, 400));


        System.out.println(a1);
    }
}
