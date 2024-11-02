package ucu.edu.ua.flower.store.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor
public class Flower extends Item{
    @Id
    private Long id;
    private FlowerType type;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public Flower(Flower flower){
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor(){
        return color.toString();
    }

    @Override
    public double getPrice(){
        return price;
    }
}
