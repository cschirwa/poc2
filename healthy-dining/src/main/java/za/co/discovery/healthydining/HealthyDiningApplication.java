package za.co.discovery.healthydining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class HealthyDiningApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthyDiningApplication.class, args);
    }

}
