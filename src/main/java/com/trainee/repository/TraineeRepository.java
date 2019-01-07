package com.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer>{

}
