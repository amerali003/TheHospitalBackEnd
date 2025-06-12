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
public class ItemOnHand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String itemName;
    private String itemPrice;
    private String itemUOM;
    private int    theItemOnhand ;
    private String storeName;

}
