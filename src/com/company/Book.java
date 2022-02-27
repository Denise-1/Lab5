package com.company;

public class Book {
    // part 2
    private String author;
    private String title;
    private int pageNum;
    private double price;

    public void name(){
        System.out.println("Denise Chen");
    }

    public String bookDescription (String title){
        return ("The title of the book is: " + title);      // title
    }

    public String bookDescription(String is, String author) {
        return (is + author);          // author
    }

    public int bookDescription (int pageNum){
        return (pageNum);            // page number
    }

    public double bookDescription (double price) {
        return price;               // price
    }

}
