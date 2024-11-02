package ucu.edu.ua.flower.store.flowers;

public class BasketDecorator {
    public Item item;
    public BasketDecorator(Item item){
        this.item = item;
    }
    public double getPrice(){
        return item.getPrice()+4;
    }
    public String getDescription(){
        return item.getDescription();
    }
}
