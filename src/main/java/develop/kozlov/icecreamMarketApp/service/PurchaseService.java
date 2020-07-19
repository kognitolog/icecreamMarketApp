package develop.kozlov.icecreamMarketApp.service;

import develop.kozlov.icecreamMarketApp.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

}
