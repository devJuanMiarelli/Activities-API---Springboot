package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Activity;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.API_CLIENT)
    public void save(@RequestBody Activity activity) { clientService.save(activity); }

    @GetMapping(Constant.API_CLIENT)
    public List<Activity> findAll() {
        return clientService.findAll();
    }

    @PutMapping(Constant.API_CLIENT)
    public void update(@RequestBody Activity activity) {
        clientService.save(activity);
    }

    @DeleteMapping(Constant.API_CLIENT + "/{id}")
    public void delete(@PathVariable String id) {
        clientService.deleteById(id);
    }

    @GetMapping(Constant.API_CLIENT + "/{id}")
    public Optional<Activity> findById(@PathVariable String id) {
        return clientService.findById(id);
    }
}
