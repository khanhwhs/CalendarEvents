package com.home.calendarevent.service;

import com.home.calendarevent.entities.EventEntity;
import com.home.calendarevent.model.Event;
import com.home.calendarevent.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll(){
        List<EventEntity> eventEntityList = eventRepository.findAll();
        List<Event> eventList = new ArrayList<>();
        for(EventEntity event: eventEntityList){
            eventList.add(new Event(event.getEventId(), event.getEventTitle(),
                    event.getEventLoc(),event.getEventDate(),null));

        }

        return eventList;
    }

    public void addEvent(String eventTitle, String eventLocation, String eventDate) throws ParseException {
        EventEntity entity = new EventEntity();
        entity.setEventTitle(eventTitle);
        entity.setEventLoc(eventLocation);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = sdf1.parse(eventDate);
        java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
        entity.setEventDate(sqlStartDate);
        eventRepository.save(entity);

    }
}

