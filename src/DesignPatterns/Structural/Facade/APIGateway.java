package DesignPatterns.Structural.Facade;

public class APIGateway {
    private final UserService userService;
    private final OrderService orderService;
    private final PaymentService paymentService;

    public APIGateway() {
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    public void getOrderInfo(String userId, String orderId, String paymentId) {
        userService.getUserDetails(userId);
        orderService.getOrderDetails(orderId);
        paymentService.getPaymentInfo(paymentId);
    }
}
