package iuh.fit.se.order;

public class CancelledState implements OrderState {
	@Override
    public void handleOrder() {
        System.out.println("Đơn hàng ở trạng thái: Hủy");
        System.out.println("Thực hiện hủy đơn hàng và hoàn tiền...");
        // Logic hủy đơn và hoàn tiền
    }
}
