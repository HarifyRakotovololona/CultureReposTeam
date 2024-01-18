package com.culture.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.culture.API.Models.MongodbEntity.Notification;
import com.culture.API.Models.MongodbEntity.NotificationRepository;

@Service
public class NotificationController {
    private final NotificationRepository repository;

    @Autowired
    public NotificationController(NotificationRepository repository) {
        this.repository = repository;
    }

    public List<Notification> getAllNotification() {
        return repository.findAll();
    }
}
