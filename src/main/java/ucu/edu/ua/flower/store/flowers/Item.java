package ucu.edu.ua.flower.store.flowers;

public abstract class Item {
    private String description;
    public abstract double getPrice();
    public String getDescription(){
        return this.description;
    }
}