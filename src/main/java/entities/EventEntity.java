package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

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

        if (eventId != that.eventId) return false;
        if (eventTitle != null ? !eventTitle.equals(that.eventTitle) : that.eventTitle != null) return false;
        if (eventDate != null ? !eventDate.equals(that.eventDate) : that.eventDate != null) return false;
        if (eventLoc != null ? !eventLoc.equals(that.eventLoc) : that.eventLoc != null) return false;
        if (usersList != null ? !usersList.equals(that.usersList) : that.usersList != null) return false;
        if (lastUpdateTs != null ? !lastUpdateTs.equals(that.lastUpdateTs) : that.lastUpdateTs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId;
        result = 31 * result + (eventTitle != null ? eventTitle.hashCode() : 0);
        result = 31 * result + (eventDate != null ? eventDate.hashCode() : 0);
        result = 31 * result + (eventLoc != null ? eventLoc.hashCode() : 0);
        result = 31 * result + (usersList != null ? usersList.hashCode() : 0);
        result = 31 * result + (lastUpdateTs != null ? lastUpdateTs.hashCode() : 0);
        return result;
    }
}
