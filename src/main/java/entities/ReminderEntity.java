package entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "REMINDER", schema = "eventDB", catalog = "")
public class ReminderEntity {
    private int reminderId;
    private String reminderMessage;
    private Timestamp reminderTs;
    private Integer eventId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReminderEntity that = (ReminderEntity) o;

        if (reminderId != that.reminderId) return false;
        if (reminderMessage != null ? !reminderMessage.equals(that.reminderMessage) : that.reminderMessage != null)
            return false;
        if (reminderTs != null ? !reminderTs.equals(that.reminderTs) : that.reminderTs != null) return false;
        if (eventId != null ? !eventId.equals(that.eventId) : that.eventId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reminderId;
        result = 31 * result + (reminderMessage != null ? reminderMessage.hashCode() : 0);
        result = 31 * result + (reminderTs != null ? reminderTs.hashCode() : 0);
        result = 31 * result + (eventId != null ? eventId.hashCode() : 0);
        return result;
    }
}
