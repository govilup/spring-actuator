package com.trainee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee.entity.Trainee;
import com.trainee.repository.TraineeRepository;

@Service
public class TraineeService {

	@Autowired
	TraineeRepository traineeRepo;

	public void addTrainee(String traineeName, String traineeLocation, String traineeDomain) {
		Trainee trainee = new Trainee();
		trainee.setTraineeName(traineeName);
		trainee.setTraineeLocation(traineeLocation);
		trainee.setTraineeDomain(traineeDomain);
		if (trainee != null)
			traineeRepo.save(trainee);
	}

	public Optional<Trainee> findTraineeById(int id) {
		return traineeRepo.findById(id);
	}

	public void deleteTraineeById(int id) {
		 traineeRepo.deleteById(id);
	}

}
