package com.jnu.books.data;


import java.io.Serializable;

public class ShopItem implements Serializable {
//    public ShopItem(String title, Double price, int resourceId) {
//        this.title = title;
//        this.price = price;
//        this.resourceId = resourceId;
//    }
public ShopItem(String title, String author, String date, int resourceId) {
    this.title = title;
    this.author = author;
    this.date = date;
    this.resourceId = resourceId;
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date=date;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    private String title;
     private String author;
     private String date;
    private int resourceId;
}
