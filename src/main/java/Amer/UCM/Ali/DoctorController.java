
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
public class DoctorController {
    @Autowired
    private DoctorRepo doctorRepo;

    @PostMapping("/AddDoctor")
    public Doctor AddDoctor(@RequestBody Doctor doctor) {
         return this.doctorRepo.save(doctor);
    }




    @GetMapping("/GetAllDoctors")
    public List<Doctor> GetAllDoctors() {
        return doctorRepo.findAll();
    }
    public static void main(String[] args) {
        SpringApplication.run(AliApplication.class, args);
    }

}
