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

public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String   transactionTypeName ;
    private String   effect ;
    private String   transactionTypeStatus;
}