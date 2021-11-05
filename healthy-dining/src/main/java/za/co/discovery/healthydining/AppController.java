package za.co.discovery.healthydining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
@RequestMapping("/hd")
public class AppController {

    @GetMapping
    public String index(){ return "This is a Fake HEALTHY DINING service"; }

    @GetMapping("/private/list")
    public Flux<Restaurant> listRestaurants(){
        return Flux.just("Mugg & Bean", "Rocco Mammas", "Tashas")
                .map(name -> new Restaurant(UUID.randomUUID(), name));
    }

    @GetMapping("/private/save/{name}")
    public Flux<Restaurant> saveRestuarant(@PathVariable String name){
        return Flux.just(name).map(n -> new Restaurant(UUID.randomUUID(), name));
    }
}
