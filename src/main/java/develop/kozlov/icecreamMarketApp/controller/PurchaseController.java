package develop.kozlov.icecreamMarketApp.controller;

import develop.kozlov.icecreamMarketApp.domain.Product;
import develop.kozlov.icecreamMarketApp.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping
    public String purchasesList(Model model) {
        //model.addAttribute("purchases", purchaseService.findAll());
        return "purchases";
    }

    @GetMapping(value = {"/add"})
    public String showAddPurchaseDocument(Model model) {
//        Product product = new Product();
//        model.addAttribute("add", true);
//        model.addAttribute("product", product);

        return "purchase-edit";
    }


}
