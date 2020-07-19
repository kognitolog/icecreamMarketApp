package develop.kozlov.icecreamMarketApp.repository;

import develop.kozlov.icecreamMarketApp.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Product, Long> {

}
