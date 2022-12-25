package com.pradipthapa.microservices.location.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ComponentScan(basePackages = {"com.pradipthapa.microservices.location.controller","com.pradipthapa.microservices.location.service"})
public class LocationController {

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }
}
