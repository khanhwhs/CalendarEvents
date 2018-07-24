package com.home.calendarevent.repository;

import com.home.calendarevent.entities.EventEntity;
import com.home.calendarevent.entities.ReminderEntity;
import com.home.calendarevent.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReminderRepository extends JpaRepository<ReminderEntity, Integer> {

    @Query(value="Select * from Reminder where WHERE reminder_TS >= TO_DATE(?1, 'DD-MM-YYYY')\n" +
            "AND reminder_TS <  TO_DATE(?1, 'DD-MM-YYYY')",nativeQuery = true)
    List<ReminderEntity> getByDate(String date);
}
