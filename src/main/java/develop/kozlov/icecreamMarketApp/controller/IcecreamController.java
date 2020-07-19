package develop.kozlov.icecreamMarketApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IcecreamController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/desktop")
    public String desktop() {
        return "desktop";
    }


}
