package Lesson8Methods;

import java.util.ArrayList;

public class Article {
    static final String COUNTRY = "Ukraine";
    private String author;
    private String title;
    private String journal;
    private int year;
    private int number;
    private int pages;
    private int volume;

    public void nextPage(){
        System.out.println("Перелистываю на следующую страницу");
    }

    public ArrayList<String> sectionList(){
        ArrayList<String> cl = new ArrayList<>();
        System.out.println("Список разделов");
        cl.add("Список глав");
        return cl;
    }

    public int sectionBypage(){
        System.out.println("Номер раздела по номеру страницы");
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

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
