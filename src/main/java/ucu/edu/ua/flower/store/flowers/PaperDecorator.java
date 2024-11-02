package ucu.edu.ua.flower.store.flowers;

public class PaperDecorator {
    public Item item;
    public PaperDecorator(Item item){
        this.item = item;
    }
    public double getPrice(){
        return item.getPrice()+13;
    }
    public String getDescription(){
        return item.getDescription();
    }
}
