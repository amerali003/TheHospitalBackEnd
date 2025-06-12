package Amer.UCM.Ali;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface ItemOnHandRepo extends JpaRepository <ItemOnHand , Integer> {

    @Query("SELECT SUM(CAST(i.theItemOnhand AS int)) FROM ItemOnHand i WHERE i.itemName = :itemName AND i.storeName = :storeName")
    Integer getSumOfItemOnHand(String itemName, String storeName);
}
