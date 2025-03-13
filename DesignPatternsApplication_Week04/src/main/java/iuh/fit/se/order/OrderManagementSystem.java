package iuh.fit.se.order;

public class OrderManagementSystem {
	public static void main(String[] args) {
        OrderContext order = new OrderContext();

        // Đơn hàng mới được tạo
        OrderState newState = new NewState();
        order.setState(newState);
        order.processOrder();
        System.out.println("---");

        // Chuyển đơn hàng sang trạng thái Đang xử lý
        OrderState processingState = new ProcessingState();
        order.setState(processingState);
        order.processOrder();
        System.out.println("---");

        // Chuyển đơn hàng sang trạng thái Đã giao
        OrderState deliveredState = new DeliveredState();
        order.setState(deliveredState);
        order.processOrder();
        System.out.println("---");

        // Chuyển đơn hàng sang trạng thái Hủy
        OrderState cancelledState = new CancelledState();
        order.setState(cancelledState);
        order.processOrder();
    }
}
