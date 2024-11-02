package ucu.edu.ua.flower.store.flowers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }
}
