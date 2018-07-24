package com.home.calendarevent.repository;

import com.home.calendarevent.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Integer> {
}
