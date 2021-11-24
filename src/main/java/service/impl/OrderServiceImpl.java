package service.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl {
    private OrderRepository orderRepository;

    @Override
    public void save(Order order) {

    }

    @Override
    public Order getById(Long id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Order findByCustomer(String customer) {
        return null;
    }

    @Override
    public Order findByOrderStatus(String orderStatus) {
        return null;
    }

    @Override
    public Order findByDeliveryDate(String deliveryDate) {
        return null;
    }

    @Override
    public Order findByReturnDate(String returnDate) {
        return null;
    }
}
