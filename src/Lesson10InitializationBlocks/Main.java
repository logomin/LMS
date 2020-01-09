package Lesson10InitializationBlocks;

/**
 * Создает экземпляр библиотеки. Добавляет фильмы в список фильмов
 */

public class Main {
    public static void main(String[] args) {
        Library library = new Library("My library");
        for (int i = 0; i < library.films.length; i++) {
            if (emptyField(library) != -1) {
                library.films[emptyField(library)] = new Film("new title", 100f, Film.GENRE_HORROR);
                //System.out.println("Добавили новый фильм в список фильмов библиотеки");
            }
            if (emptyField(library) == -1) {
                System.out.println("Вы достигли лимита"); break;
            }
        }
    }

    public static int emptyField(Library library) {
        int counter = 0;
        for (Film film : library.films) {
            if (film == null) {
                return counter;
            }
            counter += 1;
        }
        return -1;
    }
}