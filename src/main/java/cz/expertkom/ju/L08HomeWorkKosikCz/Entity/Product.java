package cz.expertkom.ju.L08HomeWorkKosikCz.Entity;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productsKosik")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private float price;

	@Column(name = "priceAfterDiscount")
	private float priceAfterDiscount;
	
	@Column(name="productId")
	private String productId;

	@Column(name="iterationStepProcessed")
	private int iterationStepProcessed;
	
	@Column(name = "insertedTimeStamp")
	//private LocalDateTime insertedTimeStamp;
	private Calendar insertedTimeStamp;

	@Column(name = "updatedTimeStamp")
	private LocalDateTime updatedTimeStamp;

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

	public float getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(float priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", priceAfterDiscount="
				+ priceAfterDiscount + ", productId=" + productId + ", iterationStepProcessed=" + iterationStepProcessed
				+ ", insertedTimeStamp=" + insertedTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
	
	
	

}
