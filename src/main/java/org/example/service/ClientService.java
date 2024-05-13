package org.example.service;

import org.example.model.Activity;
import org.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void save(Activity activity) {
        clientRepository.save(activity);
    }

    public List<Activity> findAll() {
        return clientRepository.findAll();
    }

    public Optional<Activity> findById(String id) {
        return clientRepository.findById(id);
    }

    public void deleteById(String id) {
        clientRepository.deleteById(id);
    }
}
