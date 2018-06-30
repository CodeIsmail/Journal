package com.idealorb.journal;

public class Journal {

    private String title;
    private String story;

    public Journal() {
    }

    public Journal(String title, String story) {
        this.title = title;
        this.story = story;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
