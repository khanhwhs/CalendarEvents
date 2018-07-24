package com.home.calendarevent.controller;

import com.home.calendarevent.model.Reminder;
import com.home.calendarevent.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReminderController {

    @Autowired
    ReminderService reminderService;

    @GetMapping(value = "/sendReminderByDate")
    public void sendReminder(@RequestParam("date") String date){
        reminderService.SendReminder(date);

    }

}
