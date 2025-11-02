public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, Director director, int durationInMinutes, String musicAuthor, String librettoText) {
        super(title, director, durationInMinutes);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Распечатать текст либретто
    public void printLibretto() {
        System.out.println("Либретто для '" + getTitle() + "' (Автор музыки: " + musicAuthor + ")");
        System.out.println(librettoText);
    }
}