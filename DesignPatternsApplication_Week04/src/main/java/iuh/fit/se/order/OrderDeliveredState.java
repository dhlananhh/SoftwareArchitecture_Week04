package iuh.fit.se.order;

public class OrderDeliveredState implements OrderState {
	@Override
    public void next(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order is already delivered.");
    }
}
