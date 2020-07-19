package develop.kozlov.icecreamMarketApp.repository;

import develop.kozlov.icecreamMarketApp.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByArticle(String article);

}
