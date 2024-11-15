// package ucu.edu.ua.flower.store;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import ucu.edu.ua.flower.store.delivery.Delivery;
// import ucu.edu.ua.flower.store.delivery.DHLDeliveryStrategy;
// import ucu.edu.ua.flower.store.delivery.PostDeliveryStrategy;
// import ucu.edu.ua.flower.store.flowers.Order;
// import ucu.edu.ua.flower.store.flowers.Flower;
// import ucu.edu.ua.flower.store.flowers.Item;
// import ucu.edu.ua.flower.store.payment.CreditCardPaymentStrategy;
// import ucu.edu.ua.flower.store.payment.PayPalPaymentStrategy;
// import ucu.edu.ua.flower.store.payment.Payment;
// import ucu.edu.ua.flower.store.flowers.FlowerType;
// import ucu.edu.ua.flower.store.flowers.FlowerColor;
// import java.util.ArrayList;
// import java.util.List;



// public class FlowerStoreApplicationTestsTest {
// 	@Test
// 	public void testDHLDelivery() {
// 		List<Item> items = new ArrayList<>();
// 		items.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0));
// 		Delivery delivery = new DHLDeliveryStrategy("Kozelnytska 2a");
// 		assertEquals(delivery.isDelivered(), false);
// 		delivery.deliver(items);
// 		assertEquals(delivery.isDelivered(), true);
// 	}

// 	@Test
// 	public void testPostDelivery() {
// 		List<Item> items = new ArrayList<>();
// 		items.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0));
// 		items.add(new Flower(FlowerType.TULIP, FlowerColor.GREEN, 5.0, 10.0));
// 		Delivery delivery = new PostDeliveryStrategy("Kozelnytska 2a");
// 		assertEquals(delivery.isDelivered(), false);
// 		delivery.deliver(items);
// 		assertEquals(delivery.isDelivered(), true);
// 	}

// 	@Test
// 	public void testCreditCardPayment() {
// 		List<Item> items = new ArrayList<>();
// 		items.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0));
// 		items.add(new Flower(FlowerType.TULIP, FlowerColor.GREEN, 5.0, 20.0));
// 		items.add(new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, 5.0, 15.0));
// 		Payment payment = new CreditCardPaymentStrategy();
// 		assertEquals(payment.isPaid(), false);
// 		payment.pay(items);
// 		assertEquals(payment.isPaid(), true);
// 	}

// 	@Test
// 	public void testPayPalPayment() {
// 		List<Item> items = new ArrayList<>();
// 		items.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0));
// 		items.add(new Flower(FlowerType.TULIP, FlowerColor.GREEN, 5.0, 20.0));
// 		items.add(new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, 5.0, 15.0));
// 		Payment payment = new PayPalPaymentStrategy();
// 		assertEquals(payment.isPaid(), false);
// 		payment.pay(items);
// 		assertEquals(payment.isPaid(), true);
// 	}

// 	@Test
// 	public void testOrder() {
// 		List<Item> items = new ArrayList<>();
// 		items.add(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 10.0));
// 		items.add(new Flower(FlowerType.TULIP, FlowerColor.GREEN, 5.0, 20.0));
// 		items.add(new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, 5.0, 15.0));
// 		Order order = new Order(items);
// 		order.addItem(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 2.0));
// 		order.removeItem(new Flower(FlowerType.ROSE, FlowerColor.RED, 5.0, 2.0));
// 		Delivery delivery = new DHLDeliveryStrategy("Kozelnytska 2a");
// 		Payment payment = new CreditCardPaymentStrategy();
// 		order.setDelivery(delivery);
// 		order.setPayment(payment);
// 		order.processOrder();
// 	}
// }