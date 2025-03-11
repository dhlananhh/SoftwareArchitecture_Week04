package iuh.fit.se.order;

public class NewState implements OrderState {
	@Override
    public void handleOrder() {
        System.out.println("Đơn hàng ở trạng thái: Mới tạo");
        System.out.println("Thực hiện kiểm tra thông tin đơn hàng...");
        // Logic kiểm tra thông tin đơn hàng
    }
}
