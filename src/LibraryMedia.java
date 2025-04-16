public class LibraryMedia {
    protected String title;
    protected int publicationYear;
    protected boolean available;

    public LibraryMedia(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        available = true;
    }

    public void borrow(){
        if(available){
            available = false;
            System.out.println("Borrowed!");
        }
        else{
            System.out.println("Sorry, the \"" + title + "\" is already borrowed!");
        }
    }

    public void returnMedia(){
        available = true;
        System.out.println("\"" + title + "\" is available again!");
    }

    public void displayInformation(){}

    public void displayTitle(){
        System.out.println("    Title: " + title);
    }
    public void displayPublicationYearAndAvailability(){
        System.out.println("    Publication Year: " + publicationYear);
        System.out.println("    Available: " + (available? "Available" : "Borrowed"));
    }
}
