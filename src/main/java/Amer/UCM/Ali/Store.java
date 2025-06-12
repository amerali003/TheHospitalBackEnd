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
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String  storeName ;
    private String  storeLocation ;
    private String  storeCategory;
    private String  storeStatus;
}