package com.streaming;

public class TVSeries extends Video{

    private int episodes = 0;


    public TVSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }


    public String getInfo(){
        return super.getInfo() + "\n" +
                "Número de episodios: " + episodes;

    }
}
