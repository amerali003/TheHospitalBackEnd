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
public class AppointmentController {
    @Autowired

    private AppointmentRepo appointmentRepo;

    @PostMapping("/AddAppointment")
    public Appointment AddAppointment(@RequestBody Appointment appointment) {
        return this.appointmentRepo.save(appointment);
    }
    @GetMapping("/GetAllAppointments")
    public List<Appointment> GetAllAppointments() {
        return appointmentRepo.findAll();
    }
    public static void main(String[] args) {
        SpringApplication.run(AliApplication.class, args);
    }

}
