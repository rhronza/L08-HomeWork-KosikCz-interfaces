package cz.expertkom.ju.L08HomeWorkKosikCz.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cz.expertkom.ju.L08HomeWorkKosikCz.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	/* vrátí seznam produktů sežazených podle creny od největší po nejmenší */
	@Query("select pr from Product pr order by pr.price desc")
	List<Product> getproductByPrice();
	
	/* vrátí seznam produktů s cenou_od a cenou_do seřazené od největší do nejmenší */
	@Query("select pr from Product pr where (pr.price > ?1) and (pr.price < ?2) order by pr.price desc")
	List<Product> getproductsBetweenPrice(float priceFrom, float priceTo);
	

}
