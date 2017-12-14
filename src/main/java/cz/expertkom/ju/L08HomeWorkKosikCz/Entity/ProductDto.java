package cz.expertkom.ju.L08HomeWorkKosikCz.Entity;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDto {
	
	private Long id;
	private String name;
	private float price;
	private float priceAfterDiscount;
	private String productId;
	private int iterationStepProcessed;
	private Calendar insertedTimeStamp;
	private LocalDateTime updatedTimeStamp;
	/* -------------------------------------------- */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public int getIterationStepProcessed() {
		return iterationStepProcessed;
	}
	public void setIterationStepProcessed(int iterationStepProcessed) {
		this.iterationStepProcessed = iterationStepProcessed;
	}

	public Calendar getInsertedTimeStamp() {
		return insertedTimeStamp;
	}
	public void setInsertedTimeStamp(Calendar insertedTimeStamp) {
		this.insertedTimeStamp = insertedTimeStamp;
	}
	public LocalDateTime getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}
	public void setUpdatedTimeStamp(LocalDateTime updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
	public float getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	public void setPriceAfterDiscount(float priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + ", priceAfterDiscount="
				+ priceAfterDiscount + ", productId=" + productId + ", iterationStepProcessed=" + iterationStepProcessed
				+ ", insertedTimeStamp=" + insertedTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
	
	
}

	
	
	
	


