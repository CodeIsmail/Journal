package com.idealorb.journal;

public class Journal {

    private String title;
    private String story;
    private String dateTime;



    public Journal(String title, String story, String dateTime) {
        this.title = title;
        this.story = story;
        this.dateTime = dateTime;
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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "title='" + title + '\'' +
                ", story='" + story + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
