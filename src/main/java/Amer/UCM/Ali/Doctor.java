package Amer.UCM.Ali;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String DoctorName;
    private int age;
    private String gender;
    private String MainMajorName;
    private String SubMajorName;
    private String EmergencyPhone;

}