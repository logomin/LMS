package Lesson8Methods;

import java.util.ArrayList;

public class Book {
    static final String COUNTRY = "Ukraine";
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int pages;

    public void nextPage(){
        System.out.println("Перелистываю на следующую страницу");
    }

    public void tpPage(int pageNumber){
        System.out.println("Перелистываю на определенную страницу");
    }

    public void tpPage(int chapterNumber, String chapter){
        if (chapter.equals("ch"))
        System.out.println("Перелистываю на определенную главу");
    }

    public ArrayList<String> chapterList(){
        ArrayList<String> cl = new ArrayList<>();
        System.out.println("Список глав");
        cl.add("Список глав");
        return cl;
    }

    public int chapterBypage(){
        System.out.println("Номер главы по номеру страницы");
        return 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
