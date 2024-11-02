package ucu.edu.ua.flower.store.flowers;

public class RibbonDecorator {
    public Item item;
    public RibbonDecorator(Item item){
        this.item = item;
    }
    public double getPrice(){
        return item.getPrice()+40;
    }
    public String getDescription(){
        return item.getDescription();
    }
}
