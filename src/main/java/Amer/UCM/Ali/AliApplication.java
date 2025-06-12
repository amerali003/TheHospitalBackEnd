package Amer.UCM.Ali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController

public class AliApplication {


	@Autowired
	private ItemRepo itemRepo;

	@Autowired
	private StoreRepo storeRepo;

	@Autowired
	private TransactionTypeRepo transactionTypeRepo;

	@Autowired
	private InventoryTransactionsRepo    inventoryTransactionsRepo;

	@Autowired
	private ItemOnHandRepo    itemOnHandRepo;




/*  items */

	@PostMapping("/AddItem")
	public Item AddItem(@RequestBody Item item) {

		return itemRepo.save(item);
	}

	@GetMapping("/GetAllItems")
	public List<Item> GetAllItems() {
		return itemRepo.findAll();
	}


	@GetMapping("/GetItemByID/{id}")
	public Item GetItemByID(@PathVariable int id) {
		Optional<Item> items = itemRepo.findById(id);
		return items.orElse(null);
	}
	//-----------End of items------------------



	/*  Stores */

	@PostMapping("/AddStore")
	public Store AddStore(@RequestBody Store store) {

		return storeRepo.save(store);
	}

	@GetMapping("/GetAllStores")
	public List<Store> GetAllStores() {
		return storeRepo.findAll();
	}


	@GetMapping("/GetStoreByID/{id}")
	public Store GetStoreByID(@PathVariable int id) {
		Optional<Store> store = storeRepo.findById(id);
		return store.orElse(null);
	}
	//-----------End of Stores------------------


	/*  trx Types */

	@PostMapping("/AddTransactionType")
	public TransactionType AddTransactionType(@RequestBody TransactionType transactionType) {

		return transactionTypeRepo.save(transactionType);
	}

	@GetMapping("/GetAllTransactionTypes")
	public List<TransactionType> GetAllTransactionTypes() {
		return transactionTypeRepo.findAll();
	}


	@GetMapping("/GetTransactionTypeByID/{id}")
	public TransactionType GetTransactionTypeByID(@PathVariable int id) {
		Optional<TransactionType>  transactionType  = transactionTypeRepo.findById(id);
		return transactionType.orElse(null);
	}
	//-----------End of trx Types------------------


	/*  inventory TRX */

	@PostMapping("/CreateInvTransaction")
	public InventoryTransactions CreateInvTransaction(@RequestBody InventoryTransactions inventoryTransactions) {

		return inventoryTransactionsRepo.save(inventoryTransactions);
	}

	@GetMapping("/GetAllItInvTransactions")
	public List<InventoryTransactions> GetAllItInvTransactions() {
		return inventoryTransactionsRepo.findAll();
	}


	@GetMapping("/GetInventoryTransactionByID/{id}")
	public InventoryTransactions GetInventoryTransactionByID(@PathVariable int id) {
		Optional<InventoryTransactions>  inventoryTransactions = inventoryTransactionsRepo.findById(id);
		return inventoryTransactions.orElse(null);
	}
	//-----------End of inventory TRX-----------------



	/*  item onhand */


	@PostMapping("/AddItemOnHand")
	public ItemOnHand AddItemOnHand(@RequestBody ItemOnHand itemOnHand) {

		return itemOnHandRepo.save(itemOnHand);
	}

	@GetMapping("/GetAlltemsOnhand")

	public List<ItemOnHand> GetAlltemsOnhand() {
		return itemOnHandRepo.findAll();
	}

	@GetMapping("/GetOneItemOnhand")
	public Integer GetOneItemOnhand(@RequestParam String itemName, @RequestParam String storeName) {
		return itemOnHandRepo.getSumOfItemOnHand(itemName, storeName);
	}

	//----------- item onhand-----------------

	public static void main(String[] args) {
		SpringApplication.run(AliApplication.class, args);
	}

}