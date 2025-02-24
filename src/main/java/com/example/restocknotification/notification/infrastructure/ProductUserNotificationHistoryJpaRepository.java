package com.example.restocknotification.notification.infrastructure;

import com.example.restocknotification.notification.infrastructure.entity.ProductUserNotificationHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductUserNotificationHistoryJpaRepository extends JpaRepository<ProductUserNotificationHistoryEntity, Long> {

}
