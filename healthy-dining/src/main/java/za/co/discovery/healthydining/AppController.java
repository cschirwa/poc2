package za.co.discovery.healthydining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hd")
public class AppController {

    @GetMapping
    public String index(){
        return  "Healthy Dining Service";
    }

    @GetMapping("/private/list")
    public String list(){
        return  "Healthy Dining List";
    }
    @GetMapping("/private/save/{id}")
    public String save(@PathVariable String id){
        return  "Healthy Dining Service " + id;
    }
}
