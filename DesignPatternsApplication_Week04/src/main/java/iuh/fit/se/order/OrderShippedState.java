package iuh.fit.se.order;

public class OrderShippedState implements OrderState {
	@Override
    public void next(OrderContext context) {
        System.out.println("Order has been shipped. Moving to Delivered state.");
        context.setState(new OrderDeliveredState());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order has already been shipped.");
    }
}
