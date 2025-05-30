package Amer.UCM.Ali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController

public class AliApplication {
	@Autowired
	private PatientRepo patientRepo;


	@PostMapping("/AddPatient")
	public Patient AddPatient(@RequestBody  Patient patient) {

		return patientRepo.save(patient);
	}



	@GetMapping("/GetAllPatients")
	public List<Patient> GetAllPatients() {
		return patientRepo.findAll();
	}


	@GetMapping("/GetPatientByID/{id}")
 public Patient GetPatientByID(@PathVariable int id) {
		Optional<Patient> patient = patientRepo.findById(id);
		return patient.orElse(null);
	}


	public static void main(String[] args) {
		SpringApplication.run(AliApplication.class, args);
	}




}