package ucu.edu.ua.flower.store;

import org.junit.jupiter.api.Test;

import ucu.edu.ua.flower.store.flowers.BasketDecorator;
import ucu.edu.ua.flower.store.flowers.Item;
import ucu.edu.ua.flower.store.flowers.PaperDecorator;
import ucu.edu.ua.flower.store.flowers.RibbonDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerDecoratorTests {
    @Test
    public void testRibbonDecorator() {
        Item item = new Item() {
            @Override
            public double getPrice() {
                return 100;
            }
        };
        RibbonDecorator ribbonDecorator = new RibbonDecorator(item);
        assertEquals(140, ribbonDecorator.getPrice());
    }

    @Test
    public void testBasketDecorator() {
        Item item = new Item() {
            @Override
            public double getPrice() {
                return 100;
            }
        };
        BasketDecorator basketDecorator = new BasketDecorator(item);
        assertEquals(104, basketDecorator.getPrice());
    }

    @Test
    public void testPaperDecorator() {
        Item item = new Item() {
            @Override
            public double getPrice() {
                return 100;
            }
        };
        PaperDecorator paperDecorator = new PaperDecorator(item);
        assertEquals(113, paperDecorator.getPrice());
    }
}
