package cz.expertkom.ju.L08HomeWorkKosikCz.Entity;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDto {
	
	private Long id;
	private String name;
	private float price;
	private LocalDateTime insertedTimeStamp;
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
	public LocalDateTime getInsertedTimeStamp() {
		return insertedTimeStamp;
	}
	public void setInsertedTimeStamp(LocalDateTime insertedTimeStamp) {
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
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + ", insertedTimeStamp="
				+ insertedTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
	
	
	
	
}

	
	
	
	


