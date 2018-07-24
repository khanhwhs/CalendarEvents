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
import java.util.stream.Collectors;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll(){
        List<EventEntity> eventEntityList = eventRepository.findAll();
        return eventEntityList.stream().map(event -> new Event(event.getEventId(), event.getEventTitle(),
                event.getEventLoc(),event.getEventDate(),null)
        ).collect(Collectors.toList());
    }

    public List<Event> findByMonth(int month){
        List<EventEntity> eventEntityList = eventRepository.getByMonth(month);
        return eventEntityList.stream().map(event -> new Event(event.getEventId(), event.getEventTitle(),
                event.getEventLoc(),event.getEventDate(),null)
        ).collect(Collectors.toList());
    }

    public List<Event> findByDay(int day){
        List<EventEntity> eventEntityList = eventRepository.getByYear(day);
        return eventEntityList.stream().map(event -> new Event(event.getEventId(), event.getEventTitle(),
                event.getEventLoc(),event.getEventDate(),null)
        ).collect(Collectors.toList());
    }

    public List<Event> findByYear(int year){
        List<EventEntity> eventEntityList = eventRepository.getByYear(year);
        return eventEntityList.stream().map(event -> new Event(event.getEventId(), event.getEventTitle(),
                event.getEventLoc(),event.getEventDate(),null)
        ).collect(Collectors.toList());
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

    public List<Event> findByUser(int userId){
        return null;
    } // TO DO
}

