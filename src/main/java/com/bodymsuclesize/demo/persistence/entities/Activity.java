package com.bodymsuclesize.demo.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String activity_name;
    private Activity_type actvity_type;
    @ManyToOne
    @JoinColumn(name = "training_fk")
    @JsonIgnore
    private Training training;
}