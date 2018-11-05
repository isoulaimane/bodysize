package com.bodymsuclesize.demo;


import com.bodymsuclesize.demo.persistence.entities.Training;
import com.bodymsuclesize.demo.persistence.repo.TrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TrainingResource {

    @Autowired
    TrainingRepo repo;


    @GetMapping("/listTraining")
    public List<Training> getAllTrainings(){
        return repo.findAll();
    }
}
