package com.Pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOuTo;


    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut= false;
        this.checkedOuTo="";
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOuTo() {
        return checkedOuTo;
    }

    public void checkOut(String name) {
        this.checkedOuTo= name;
        this.isCheckedOut= true;
    }

    public void checkIn() {
        this.checkedOuTo="";
        this.isCheckedOut=false;

    }
}
