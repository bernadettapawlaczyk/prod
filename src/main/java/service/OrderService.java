package service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class OrderService {
    public abstract void save(Order order);

    public abstract Order getById(Long id);

    public abstract List<Order> getAll();

    public abstract void update(Order order);

    public abstract void delete(Long id);

    public abstract Order findByCustomer(String customer);

    public abstract Order findByOrderStatus(String orderStatus);

    public abstract Order findByDeliveryDate(String deliveryDate);

    public abstract Order findByReturnDate(String returnDate);
}
