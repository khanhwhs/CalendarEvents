package com.home.calendarevent.controller;

import com.home.calendarevent.model.Event;
import com.home.calendarevent.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping(value="/getAllEvent")
    public List<Event> getAllEvent(){
        return eventService.findAll();
    }

    @PostMapping(value = "/addEvent")
    public void addEvent( @RequestParam("eventName") String eventName,
                          @RequestParam("eventLoc") String eventLoc,
                          @RequestParam("eventDate") String eventDate) throws ParseException {

        eventService.addEvent(eventName,eventLoc,eventDate);
    }
}
