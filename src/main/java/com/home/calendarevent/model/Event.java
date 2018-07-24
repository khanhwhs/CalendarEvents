package com.home.calendarevent.model;

import java.util.Date;
import java.util.List;

public class Event {
    private int eventId;
    private String eventTitle;
    private String eventLoc;
    private Date eventDate;
    private List<User> userList;

    public Event(int eventId, String eventTitle, String eventLoc, Date eventDate, List<User> userList) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventLoc = eventLoc;
        this.eventDate = eventDate;
        this.userList = userList;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventLoc() {
        return eventLoc;
    }

    public void setEventLoc(String eventLoc) {
        this.eventLoc = eventLoc;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
