public class Movie extends LibraryMedia {
    private String director;
    private int duration;
    private double ratingOnIMDB;

    public Movie(String title, String director, int duration, int publicationYear, double ratingOnIMDB) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
        this.ratingOnIMDB = ratingOnIMDB;

    }
    public void checkDuration(){
        System.out.println("    " + (duration>120? "long" : "short" ) + " movie");
    }

    @Override
    public void displayInformation() {
        super.displayTitle();
        System.out.println("    Director: " + director);
        System.out.println("    Rating on IMDB: " + ratingOnIMDB);
        System.out.println("    Duration: " + duration);
        super.displayPublicationYearAndAvailability();
    }
}
