package service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    void save (Order order);
    Order getById(Long id);
    List<Order> getAll();

    void update(Order order);

    void delete(Long id);

    Order findByCustomer(String customer);
    Order findByOrderStatus(String orderStatus);
    Order findByDeliveryDate (String deliveryDate);
    Order findByReturnDate(String returnDate);
}
