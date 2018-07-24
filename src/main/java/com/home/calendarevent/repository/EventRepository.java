package com.home.calendarevent.repository;

import com.home.calendarevent.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity, Integer> {

    @Query(value = "select * from EVENT where year(event_date) = ?1 ",
            nativeQuery = true)
    List<EventEntity> getByYear(int year);

    @Query(value = "select * from EVENT where month(event_date) = ?1 ",
            nativeQuery = true)
    List<EventEntity> getByMonth(int month);

    @Query(value = "select * from EVENT where day(event_date) = ?1 ",
            nativeQuery = true)
    List<EventEntity> getByDay(int day);
}
