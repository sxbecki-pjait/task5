//This is a subclass of library Media - extends means that this class has a parent;

public class Book extends LibraryMedia{
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages, int publicationYear) {
        super(title,publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void checkWhetherBookIsLong(){
        System.out.println(numberOfPages>500?"\"" + title + "\" is long":"\"" + title + "\" is not long");
    }

    public void checkNumberOfPages(){
        System.out.println("    " + (numberOfPages>120? "long" : "short" ) + " book");
    }

    @Override
    public void displayInformation(){
        super.displayTitle();
        System.out.println("    Author: " + author);
        System.out.println("    Number of pages: " + numberOfPages);
        super.displayPublicationYearAndAvailability();
    }

}
