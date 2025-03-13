package iuh.fit.se.order;

public class OrderContext {
	private OrderState currentState;

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void processOrder() {
        if (currentState != null) {
            currentState.handleOrder();
        } else {
            System.out.println("Đơn hàng không có trạng thái hợp lệ.");
        }
    }
}
