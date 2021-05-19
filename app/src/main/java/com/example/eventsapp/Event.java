package com.example.eventsapp;

public class Event {

    public String eventTitle, eventDate, eventDescription, eventImage, eventGenre, eventFee, eventDay, eventMonth,
    eventPrivacy;
    public Double latitude, longitude;

    // if we create an empty object of this class
    // we have access to the variables via a
    // default empty constructor.
    public Event(){}

    public Event(String eventTitle, String eventDate, String eventDescription, String eventImage, String eventGenre, String eventFee, String eventMonth, String eventDay, String eventPrivacy, Double latitude, Double longitude) {
        this.eventTitle = eventTitle;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
        this.eventImage = eventImage;
        this.eventGenre = eventGenre;
        this.eventFee = eventFee;
        this.eventMonth = eventMonth;
        this.eventDay = eventDay;
        this.latitude = latitude;
        this.longitude = longitude;
        this.eventPrivacy = eventPrivacy;
    }

    public String getEventFee(){
        return  "$ " + eventFee;
    }

    public void setEventFee(){
        this.eventFee = eventFee;
    }

    public String getEventGenre(){ return eventGenre;}

    public void setEventGenre(){
        this.eventGenre = eventGenre;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventImage() {
        return eventImage;
    }

    public String getEventMonth() { return eventMonth; }

    public String getEventDay() { return eventDay; }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setEventImage(String eventImage) {
        this.eventImage = eventImage;
    }

    public Double getLatitude(){
        return latitude;
    }

    public Double getLongitude(){
        return longitude;
    }

    public String getEventPrivacy(){
        return eventPrivacy;
    }
}
