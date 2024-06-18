package service;

import exception.OrderException;
import model.Address;
import model.Order;
import model.User;

import java.util.List;

public interface OrderService {

    public Order createOrder(User user, Address shippingAddress);
    public Order findOrderById(Long orderId) throws OrderException;
    public List<Order> usersOrderHistory(Long userId);
    public Order placedOrder(Long orderId) throws OrderException;
    public Order confirmedOrder(Long orderId) throws OrderException;
    public Order shipppedOrder(Long orderId) throws OrderException;
    public Order deliveredOrder(Long orderId) throws OrderException;
    public Order canceledOrder(Long orderId) throws OrderException;

    public List<Order> getAllOrders();
    public void deleteOrder(Long orderId) throws OrderException;

}
