package cz.expertkom.ju.L08HomeWorkKosikCz.interfaces;

import java.util.List;

import cz.expertkom.ju.L08HomeWorkKosikCz.Entity.Product;
import cz.expertkom.ju.L08HomeWorkKosikCz.Entity.ProductDto;
import cz.expertkom.ju.L08HomeWorkKosikCz.Entity.Products;

public interface ProductDbServices {
	
	public Products getAll();
	public Products getOne(Long id);
	public ProductDto getOne2(Long id);
	public Products getProductsPartText (String partText);
	public void insertProduct(ProductDto productDto);
	public void deleteProduct(Long id);
	public void	updateProduct(Long id, ProductDto productdto);
	public Products getAllOrderByprice();
	public Products getAllBetweenPrice(float priceFrom, float priceTo);
	public Products getProductsPerName(String nameProduct);
	public void setAllIterationStepsProcessedDown();
	public int getCountNonProcessedProduct();
	public int getCountProcessedProduct();
	public long countProducts();
	
	
	
	
		

}
