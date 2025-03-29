package iuh.fit.se.order;

public class OrderContext {
	private OrderState currentState;
	
	public OrderContext() {
        currentState = new OrderPlacedState();  // Default state
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void proceedToNext() {
        currentState.next(this);
    }

    public void cancelOrder() {
        currentState.cancel(this);
    }
}
