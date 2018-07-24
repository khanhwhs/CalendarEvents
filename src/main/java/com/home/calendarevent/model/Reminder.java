package com.home.calendarevent.model;

import java.sql.Timestamp;

public class Reminder {

    private int reminderId;
    private String reminderMessage;
    private Timestamp reminderTime;
    private boolean reminderFlag;

    public Reminder(int reminderId, String reminderMessage, Timestamp reminderTime, boolean reminderFlag) {
        this.reminderId = reminderId;
        this.reminderMessage = reminderMessage;
        this.reminderTime = reminderTime;
        this.reminderFlag = reminderFlag;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public String getReminderMessage() {
        return reminderMessage;
    }

    public void setReminderMessage(String reminderMessage) {
        this.reminderMessage = reminderMessage;
    }

    public Timestamp getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Timestamp reminderTime) {
        this.reminderTime = reminderTime;
    }

    public boolean isReminderFlag() {
        return reminderFlag;
    }

    public void setReminderFlag(boolean reminderFlag) {
        this.reminderFlag = reminderFlag;
    }
}
