package com.streaming;

public class Movie extends Video{
    private double rating = 0.0;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public String getInfo(){
        return super.getInfo() + "\n" +
                "Puntuación de: " + rating;

    }
}
