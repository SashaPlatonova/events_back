package com.example.demo.servise;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository repository;

    public List<Event> getAll() {
        return (List<Event>) repository.findAll();
    }

    public List<Event> getAllById(int id) {
        System.out.println(repository.findAllByOwner(id));
        return repository.findAllByOwner(id);
    }
}