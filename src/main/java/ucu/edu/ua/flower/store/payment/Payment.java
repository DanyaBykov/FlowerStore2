package ucu.edu.ua.flower.store.payment;

import java.util.List;
import ucu.edu.ua.flower.store.flowers.Item;

public interface Payment {
    double pay(List<Item> items);
    boolean isPaid();
}
