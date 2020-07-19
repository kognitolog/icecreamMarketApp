package develop.kozlov.icecreamMarketApp.controller;

import develop.kozlov.icecreamMarketApp.domain.Product;
import develop.kozlov.icecreamMarketApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productlist")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String productlist(Model model) {
        model.addAttribute("productlist", productService.findAll());
        return "productlist";
    }

    @GetMapping(value = {"/add"})
    public String showAddProduct(Model model) {
        Product product = new Product();
        model.addAttribute("add", true);
        model.addAttribute("product", product);

        return "product-edit";
    }

    @PostMapping(value = "/add")
    public String addProduct(Model model,
                             @ModelAttribute("product") Product product) {

        productService.save(product);
        return "redirect:/productlist";
    }

    @GetMapping(value = {"/{productId}/edit"})
    public String showEditProduct(Model model, @PathVariable long productId) {
        Product product = null;
        product = productService.findById(productId);
        model.addAttribute("add", false);
        model.addAttribute("product", product);
        return "product-edit";
    }

    @PostMapping(value = {"/{productId}/edit"})
    public String updateProduct(Model model,
                                @PathVariable Long productId,
                                @ModelAttribute("product") Product product) {

        product.setId(productId);
        productService.update(product);
        return "redirect:/productlist";
    }

    @GetMapping(value = {"/{productId}/remove"})
    public String removeProduct(Model model, @PathVariable long productId) {
        productService.deleteById(productId);
        return "redirect:/productlist";
    }
}
