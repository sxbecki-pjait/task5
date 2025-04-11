import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Robert Lewandowski | Official Biography", "Robert Lewandowski", 111, 2010);
        Movie m1 = new Movie("Se7en", "Polack", 120, 2009, 7.9);
        List<LibraryMedia> mediaArray = new ArrayList<>();
        mediaArray.add(m1);
        mediaArray.add(b1);
        b1.checkWhetherBookIsLong();
        m1.borrow();
        m1.borrow();

        for(LibraryMedia media : mediaArray) {
            System.out.println();
            if(media instanceof Book) {
                System.out.println("Instance of Book");
            }
            if(media instanceof Movie) {
                System.out.println("Instance of Movie");
            }
            media.displayInformation();
        }
        m1.returnMedia();
    }
}