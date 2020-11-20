package com.black_lemon;


import java.util.ArrayList;
import java.util.Arrays;

public class Book {

    private int id;
    private String author;
    private String name;
    private String language;
    private String publisher;
    private String publishYear;
    private double priceValue;
    private int numberOfPages;
    private ArrayList<String> notesWhenReturn = new ArrayList<>();
    private boolean borrowed;



    public Book(int id, String author, String name, String language, String publisher, String publishYear, double priceValue, int numberOfPages, ArrayList<String> notesWhenReturn, boolean borrowed) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.language = language;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.priceValue = priceValue;
        this.numberOfPages = numberOfPages;
        this.notesWhenReturn = notesWhenReturn;
        this.borrowed =borrowed;
    }







    //behavior


    private void addNewNote(String note){

        this.notesWhenReturn.add(note);


    }





















    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public double getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(double priceValue) {
        this.priceValue = priceValue;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    //TODO: check array return by get and assign by set
    public ArrayList<String> getNotesWhenReturn() {
        return notesWhenReturn;
    }

    public void setNotesWhenReturn(ArrayList<String> notesWhenReturn) {
        this.notesWhenReturn = notesWhenReturn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", priceValue=" + priceValue +
                ", numberOfPages=" + numberOfPages +
                ", notesWhenReturn=" + notesWhenReturn +

                '}';
    }
}
