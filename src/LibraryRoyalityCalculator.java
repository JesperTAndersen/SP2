public class LibraryRoyalityCalculator {

    public static void main(String[] args) {
        Author a1 = new Author("Jens");
        Author a2 = new Author("Tine");

        a1.addTitle(new AudioBook("Bog1","TE",100, 300));
        a1.addTitle(new PrintedBook("Bog2","FAG",100, 400));

        a2.addTitle(new AudioBook("Bog1","LYRIK",100, 300));


        System.out.println(a1);
        System.out.println(a2);
    }
}
