package iuh.fit.se.order;

public class DeliveredState implements OrderState {
	@Override
    public void handleOrder() {
        System.out.println("Đơn hàng ở trạng thái: Đã giao");
        System.out.println("Cập nhật trạng thái đơn hàng thành công.");
        // Logic cập nhật trạng thái đã giao
    }
}
