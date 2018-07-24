package com.home.calendarevent.repository;

import com.home.calendarevent.entities.ReminderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<ReminderEntity, Integer> {
}
