package iuh.fit.se.order;

public interface OrderState {
	void next(OrderContext context);
    void cancel(OrderContext context);
}
