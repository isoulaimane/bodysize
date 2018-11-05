package com.bodymsuclesize.demo.persistence.repo;


import com.bodymsuclesize.demo.persistence.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepo  extends JpaRepository<Activity, Long> {
}
