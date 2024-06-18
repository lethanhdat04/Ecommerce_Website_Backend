package service;

import exception.OrderException;
import model.Address;
import model.Order;
import model.User;
import org.springframework.stereotype.Service;
import repository.CartRepository;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService{

    private CartRepository cartRepository;
    private CartService cartService;
    private ProductService productService;

    public OrderServiceImplementation(CartRepository cartRepository,
                                      CartService cartService,
                                      ProductService productService){
        this.cartService = cartService;
        this.cartRepository = cartRepository;
        this.productService = productService;

    }

    @Override
    public Order createOrder(User user, Address shippingAddress) {
        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return null;
    }

    @Override
    public Order placedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order shipppedOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public Order canceledOrder(Long orderId) throws OrderException {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {

    }
}
