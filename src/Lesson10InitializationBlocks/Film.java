package Lesson10InitializationBlocks;

/**
 * Class Film
 */

public class Film {
    private String title;
    private float duration;
    private String genre;

    public static final String GENRE_COMEDY = "comedy";
    public static final String GENRE_FICTION = "fiction";
    public static final String GENRE_HORROR = "horror";

    static {
        System.out.println("Создается новый фильм");
    }

    public Film(String title, float duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм \"" + title + "\", успешно создан");
    }

    public String getTitle() {
        return title;
    }

    public float getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
