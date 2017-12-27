package cz.expertkom.ju.L08HomeWorkKosikCz.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cz.expertkom.ju.L08HomeWorkKosikCz.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	/* vrátí seznam produktů sežazených podle creny od největší po nejmenší */
	@Query(value="select pr from Product pr order by pr.price desc", nativeQuery = false)
	List<Product> getproductByPrice();
	
	/* vrátí seznam produktů s cenou_od a cenou_do seřazené od největší do nejmenší */
	@Query(value="select pr from Product pr where (pr.price > ?1) and (pr.price < ?2) order by pr.price desc", nativeQuery = false)
	List<Product> getproductsBetweenPrice(float priceFrom, float priceTo);
	
	/* vrátí seznam produktů které mají stejný název jako vstupní parametr */
	@Query(value="select pr from Product pr where pr.name = ?1", nativeQuery = false)
	List<Product> getProductsPerName(String nameProduct);
	
	/* vrátí počet produktů u kterých NEDOŠLO k aktualizaci ceny */
	@Query(value="select count(*) from Product pr where pr.iterationStepProcessed = 0 ", nativeQuery = false)
	int getCountNonProcessedProduct();

	/* vrátí počet produktů u kterých DOŠLO k aktualizaci ceny */
	@Query(value="select count(*) from Product pr where pr.iterationStepProcessed = 1 and pr.updatedTimeStamp is not null ", nativeQuery = false)
	int getCountProcessedProduct();
	
	/* vrací počet produktů v tabulce */
	@Query(value="select count(*) from Product", nativeQuery=false)
	long countProducts();
	
	/* nastaví hodnotu atributu iterationStepProcessed na 0 */
	@Modifying
	@Transactional
	@Query (value="update Product pr set pr.iterationStepProcessed=0", nativeQuery=false)
	int setAllIterationStepsProccesedDown();
	
	/* vrací seznam produktů v jejichž názvu je zadaný text */ 
	@Query(value="select pr from Product pr where pr.name like %?1% ", nativeQuery=false)
	List<Product> findProductsPartName(String txt);
	

}
 