package com.home.calendarevent.service;

import com.home.calendarevent.entities.ReminderEntity;
import com.home.calendarevent.model.Reminder;
import com.home.calendarevent.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReminderService {
    @Autowired
    ReminderRepository reminderRepository;

    public List<Reminder> findAll(){
        List<ReminderEntity> entityList = reminderRepository.findAll();
        return entityList.stream().map(entry -> new Reminder(entry.getReminderId(), entry.getReminderMessage(),
                entry.getReminderTs(),entry.getReminderFlag().equals("1")? true: false)
        ).collect(Collectors.toList());
    }

    public void addReminder(String reminderMessage, String reminderDate){ // TODO
    }

    public void SendReminder(String reminderDate){ // TODO
        reminderRepository.getByDate(reminderDate);
    }

    public void SendReminderToUser(String userId){ // TODO

    }
}
