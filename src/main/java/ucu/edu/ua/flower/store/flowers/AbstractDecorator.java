package ucu.edu.ua.flower.store.flowers;

public abstract class AbstractDecorator{
    public Item item;
    public AbstractDecorator(Item item){
        this.item = item;
    }
    public abstract double getPrice();
    public String getDescription(){
        return item.getDescription();
    }
}