package cz.expertkom.ju.L08HomeWorkKosikCz.Entity;

import java.time.LocalDateTime;
import java.util.Calendar;

import lombok.Data;

@Data
public class ProductDto {
	
	private Long id;
	private String name;
	private float price;
	private float priceAfterDiscount;
	private String productId;
	private int iterationStepProcessed;
	private Calendar insertedTimeStamp;
	private LocalDateTime updatedTimeStamp;

}

	
	
	
	


