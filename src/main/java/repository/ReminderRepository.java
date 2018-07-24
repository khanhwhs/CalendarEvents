package repositories;

import entities.ReminderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<ReminderEntity, Integer> {
}
