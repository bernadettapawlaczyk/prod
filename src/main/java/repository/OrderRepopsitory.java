package repository;

import model.Customer;
import model.OrderStatus;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public abstract class OrderRepopsitory implements CrudRepository<Order, Long> {

    public abstract Optional<Order> findById(Long id);

    abstract Optional<Order> findByCustomer(Customer customer);

    abstract Optional<Order> findByOrderStatus(OrderStatus orderStatus);

    abstract Optional<Order> findByDeliveryDate(LocalDate deliveryDate);

    abstract Optional<Order> findByReturnDate(LocalDate returnDate);
}

