package com.trainee.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.entity.Trainee;
import com.trainee.service.TraineeService;

@RestController
public class TraineeResource {

	@Autowired
	TraineeService traineeService;

	@PostMapping("/addTrainee/{traineeName}/{traineeLocation}/{traineeDomain}")
	public void addTrainee(@PathVariable("traineeName") String traineeName,
			@PathVariable("traineeLocation") String traineeLocation,
			@PathVariable("traineeDomain") String traineeDomain) {

		traineeService.addTrainee(traineeName, traineeLocation, traineeDomain);
	}
	
	@GetMapping("/findTrainee/{id}")
	public Optional<Trainee> findTrainee(@PathVariable("id") int id) {
		return traineeService.findTraineeById(id);
	}
	
	@DeleteMapping("/deleteTrainee/{id}")
	public void deleteTrainee(@PathVariable("id") int id) {
		traineeService.deleteTraineeById(id);
	}

}
