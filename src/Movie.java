public class Movie extends LibraryMedia {
    private String director;
    private String duration;
    private double ratingOnIMDB;

    public Movie(String title, String director, String duration, int publicationYear, double ratingOnIMDB) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
        this.ratingOnIMDB = ratingOnIMDB;

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
