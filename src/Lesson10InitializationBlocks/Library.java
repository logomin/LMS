package Lesson10InitializationBlocks;

/**
 * Class Library
 */

public class Library {
    private final String name;
    Film[] films = new Film[5];
    {
        films[0] = new Film("Maleficent: Mistress of Evil", 118.49f, Film.GENRE_FICTION);
        films[1] = new Film("A Beautiful Day in the Neighborhood", 118.39f, Film.GENRE_COMEDY);
        System.out.println("Добавлены любимые фильмы");
    }

    public Library(String name) {
        this.name = name;
        System.out.println("Библиотека " + name + " успешно создана");
    }

    public String getName() {
        return name;
    }

    public Film[] getFilms() {
        return films;
    }
}
