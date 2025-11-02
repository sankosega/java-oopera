public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, Director director, int durationInMinutes, String musicAuthor, String librettoText, int choirSize) {
        super(title, director, durationInMinutes, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    // Геттер для получения размера хора
    public int getChoirSize() {
        return choirSize;
    }
}