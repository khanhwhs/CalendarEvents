package com.home.calendarevent.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "EVENT", schema = "eventDB", catalog = "")
public class EventEntity {
    private int eventId;
    private String eventTitle;
    private Date eventDate;
    private String eventLoc;
    private String usersList;
    private Timestamp lastUpdateTs;

    @Id
    @Column(name = "EVENT_ID")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "EVENT_TITLE")
    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    @Basic
    @Column(name = "EVENT_DATE")
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Basic
    @Column(name = "EVENT_LOC")
    public String getEventLoc() {
        return eventLoc;
    }

    public void setEventLoc(String eventLoc) {
        this.eventLoc = eventLoc;
    }

    @Basic
    @Column(name = "USERS_LIST")
    public String getUsersList() {
        return usersList;
    }

    public void setUsersList(String usersList) {
        this.usersList = usersList;
    }

    @Basic
    @Column(name = "LAST_UPDATE_TS")
    public Timestamp getLastUpdateTs() {
        return lastUpdateTs;
    }

    public void setLastUpdateTs(Timestamp lastUpdateTs) {
        this.lastUpdateTs = lastUpdateTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return eventId == that.eventId &&
                Objects.equals(eventTitle, that.eventTitle) &&
                Objects.equals(eventDate, that.eventDate) &&
                Objects.equals(eventLoc, that.eventLoc) &&
                Objects.equals(usersList, that.usersList) &&
                Objects.equals(lastUpdateTs, that.lastUpdateTs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eventId, eventTitle, eventDate, eventLoc, usersList, lastUpdateTs);
    }
}
