public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, Director director, int durationInMinutes, String musicAuthor, String librettoText, String choreographer) {
        super(title, director, durationInMinutes, musicAuthor, librettoText); // <-- Передача длительности
        this.choreographer = choreographer;
    }

    // Геттер для получения хореографа
    public String getChoreographer() {
        return choreographer;
    }
}