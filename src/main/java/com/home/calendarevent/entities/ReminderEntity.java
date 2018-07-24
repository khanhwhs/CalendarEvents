package com.home.calendarevent.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "REMINDER", schema = "eventDB", catalog = "")
public class ReminderEntity {
    private int reminderId;
    private String reminderMessage;
    private Timestamp reminderTs;
    private Integer eventId;
    private String reminderFlag;

    @Id
    @Column(name = "REMINDER_ID")
    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    @Basic
    @Column(name = "REMINDER_MESSAGE")
    public String getReminderMessage() {
        return reminderMessage;
    }

    public void setReminderMessage(String reminderMessage) {
        this.reminderMessage = reminderMessage;
    }

    @Basic
    @Column(name = "REMINDER_TS")
    public Timestamp getReminderTs() {
        return reminderTs;
    }

    public void setReminderTs(Timestamp reminderTs) {
        this.reminderTs = reminderTs;
    }

    @Basic
    @Column(name = "EVENT_ID")
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "REMINDER_FLAG")
    public String getReminderFlag() {
        return reminderFlag;
    }

    public void setReminderFlag(String reminderFlag) {
        this.reminderFlag = reminderFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReminderEntity that = (ReminderEntity) o;
        return reminderId == that.reminderId &&
                Objects.equals(reminderMessage, that.reminderMessage) &&
                Objects.equals(reminderTs, that.reminderTs) &&
                Objects.equals(eventId, that.eventId) &&
                Objects.equals(reminderFlag, that.reminderFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(reminderId, reminderMessage, reminderTs, eventId, reminderFlag);
    }
}
