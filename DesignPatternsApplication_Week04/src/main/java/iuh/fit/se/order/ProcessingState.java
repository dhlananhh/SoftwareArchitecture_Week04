package iuh.fit.se.order;

public class ProcessingState implements OrderState {
	@Override
    public void handleOrder() {
        System.out.println("Đơn hàng ở trạng thái: Đang xử lý");
        System.out.println("Thực hiện đóng gói và vận chuyển...");
        // Logic đóng gói và vận chuyển
    }
}
