package com.example.restocknotification.notification.application.repository;

import com.example.restocknotification.notification.domain.entity.ProductNotificationHistory;

public interface ProductNotificationHistoryRepository {

    void save(ProductNotificationHistory history);

}
