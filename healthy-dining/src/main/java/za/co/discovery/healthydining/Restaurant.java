package za.co.discovery.healthydining;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private UUID id;
    private String name;
}
