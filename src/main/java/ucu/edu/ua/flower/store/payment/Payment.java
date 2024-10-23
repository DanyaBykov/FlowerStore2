/** 
 * The Payment interface provides methods for processing payments and checking payment status.
 */
package ucu.edu.ua.flower.store.payment;

import java.util.List;
import ucu.edu.ua.flower.store.flowers.Item;

/**
 * The Payment interface provides methods for processing payments and checking payment status.
 */
public interface Payment {
    double pay(List<Item> items);
    abstract boolean isPaid();
}
