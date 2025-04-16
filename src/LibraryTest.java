import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Robert Lewandowski | Official Biography", "Robert Lewandowski", 111, 2010);
        Movie m1 = new Movie("Se7en", "Polack", 120, 2009, 7.9);
        Movie m2 = new Movie("Goats", "Hans Schneider", 100, 2019, 4.6);
        Book b2 = new Book("Catharsis", "Henryk Bobrzycki", 230, 1997);
        List<LibraryMedia> mediaArray = new ArrayList<>();
        mediaArray.add(m1);
        mediaArray.add(b1);
        mediaArray.add(m2);
        mediaArray.add(b2);
        b1.checkWhetherBookIsLong();
        m1.borrow();
        m1.borrow();

        for(LibraryMedia media : mediaArray) {
            System.out.println();
            if(media instanceof Book) {
                System.out.println("Instance of Book");
                ((Book) media).checkNumberOfPages();
            }
            if(media instanceof Movie) {
                System.out.println("Instance of Movie");
                ((Movie) media).checkDuration();
            }
            media.displayInformation();
        }
        m1.returnMedia();
    }
}