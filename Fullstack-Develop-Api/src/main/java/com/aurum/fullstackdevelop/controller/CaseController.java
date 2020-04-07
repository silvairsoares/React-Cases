package com.aurum.fullstackdevelop.controller;

import com.aurum.fullstackdevelop.Repository.CaseRepository;
import com.aurum.fullstackdevelop.model.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;
import java.util.List;


@RequestMapping("/cases")
@RestController
public class CaseController {
    @Autowired
    private CaseRepository caseRepository;

    @GetMapping
    Flux<Case> findAll(){
        return caseRepository.findAll();
    }

    @GetMapping("/{caseId}")
    Mono<Case> findById(@PathVariable String caseId){
        return caseRepository.findById(caseId);
    }

    @PostMapping("/save")
    Mono<Case> save(@RequestBody Case caseObj){
        if(caseObj.getId()==null || caseObj.getId().isEmpty())
            caseObj.setId(String.valueOf(Calendar.getInstance().getTimeInMillis()));
        return caseRepository.save(caseObj);
    }

    @PostMapping("/saveall")
    Flux<Case> saveAll(@RequestBody List<Case> caseObj){
        caseObj.forEach(i -> i.setId(String.valueOf(Calendar.getInstance().getTimeInMillis())));
        return caseRepository.saveAll(caseObj);
    }


    @DeleteMapping("/{caseId}")
    void delete(@PathVariable String caseId){
        caseRepository.deleteById(caseId).block();
    }

    @GetMapping("/find")
    Flux<Case> findByClient(@RequestParam String findParam){
        return caseRepository.findAll().filter(caseO -> caseO.getSearchLowerCase().contains(findParam));
    }

}

