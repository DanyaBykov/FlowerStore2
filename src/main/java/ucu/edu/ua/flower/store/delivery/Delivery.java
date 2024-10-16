package ucu.edu.ua.flower.store.delivery;

import ucu.edu.ua.flower.store.flowers.Item;
import java.util.List;

public interface Delivery {
    double deliver(List<Item> items);
    boolean isDelivered();
}
