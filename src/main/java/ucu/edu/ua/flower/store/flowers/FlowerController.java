package ucu.edu.ua.flower.store.flowers;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FlowerController {
    @GetMapping("flowers")
    public List<Flower> hello(){
        return List.of(new Flower(FlowerType.ROSE, FlowerColor.RED, 10.0 , 10.0));
    }
}
