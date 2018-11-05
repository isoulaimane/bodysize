package com.bodymsuclesize.demo.persistence.repo;


import com.bodymsuclesize.demo.persistence.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepo extends JpaRepository<Training, Long> {
}
