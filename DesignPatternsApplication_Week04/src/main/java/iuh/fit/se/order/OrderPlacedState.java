package iuh.fit.se.order;

public class OrderPlacedState implements OrderState {
	@Override
    public void next(OrderContext context) {
        System.out.println("Order has been placed. Moving to Shipped state.");
        context.setState(new OrderShippedState());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order has been cancelled.");
        context.setState(new OrderCancelledState());
    }
}
