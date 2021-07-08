package za.co.discovery.pointsmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pm")
public class AppController {

    @GetMapping
    public String index(){
        return "This is a fake POINTS MANAGER service";
    }
}
