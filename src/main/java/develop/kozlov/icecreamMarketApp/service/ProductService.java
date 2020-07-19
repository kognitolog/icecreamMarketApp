package develop.kozlov.icecreamMarketApp.service;

import develop.kozlov.icecreamMarketApp.domain.Product;
import develop.kozlov.icecreamMarketApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return productList;
    }

    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }

    public Product findById(long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }

    public void update(Product product) {
        productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
