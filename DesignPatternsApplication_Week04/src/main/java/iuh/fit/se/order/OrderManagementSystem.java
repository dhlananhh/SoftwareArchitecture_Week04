package iuh.fit.se.order;

public class OrderManagementSystem {

	public static void main(String[] args) {
		OrderContext order = new OrderContext();

        System.out.println("Order Workflow:");
        order.proceedToNext();  // Move to Shipped
        order.proceedToNext();  // Move to Delivered
        order.cancelOrder();    // Try to cancel after delivery

        System.out.println("\nNew Order Workflow:");
        OrderContext newOrder = new OrderContext();
        newOrder.cancelOrder();  // Cancel immediately after placement
	}

}
