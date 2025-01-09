package com.anpc8001.dao;

import java.util.List;
import com.anpc8001.entity.Batches;

public interface BatchesDao {
	
	 void createNewBatch(); //create new batch
	 void viewBatchById(); //fetch details using id
	 List<Batches> getAllBatches(); //fetch all batch details
	 void updateBatchDetails(); //edit end date or teacher name of batch
	 void viewBatchByCenter(String centerCode);

}
