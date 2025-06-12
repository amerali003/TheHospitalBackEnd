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
public class SaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String   transactionName ;
    private String   storeName ;
    private String   itemName;
    private String   customerName ;
    private int      quantity;
}
