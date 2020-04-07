package com.aurum.fullstackdevelop.controller;

import com.aurum.fullstackdevelop.Repository.ClientRepository;
import com.aurum.fullstackdevelop.model.Case;
import com.aurum.fullstackdevelop.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sun.tools.jar.CommandLine;

import java.util.Calendar;

@RequestMapping("/clients")
@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping
    Flux<Client> findAll(){
        return clientRepository.findAll();
    }

    @GetMapping("/findone")
    Mono<Client> findById(String id){
        return clientRepository.findById(id);
    }

    @PostMapping("/save")
    void save(@RequestBody Client client){
        client =  clientRepository.save(client).block();
    }

    @DeleteMapping
    void delete(@RequestParam String clientId){
        clientRepository.deleteById(clientId);
    }

    @GetMapping("/find")
    Flux<Client> findByClient(@RequestParam String paramSearch){
        return clientRepository.findByName(paramSearch);
    }

}
