package com.example.getitemview.ui;

public class Item {
    private int type;
    private String title;
    private int image;

    public Item(int type, String title, int image) {
        this.type = type;
        this.title = title;
        this.image = image;
    }

    public Item(int type, String title) {
        this.type = type;
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
