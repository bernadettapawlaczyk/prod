package repository;

import model.Customer;
import model.OrderStatus;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public class OrderRepopsitory extends CrudRepository<Order, Long> {
    Optional<Order> findById(Long id);

    Optional<Order> findByCustomer(Customer customer);

    Optional<Order> findByOrderStatus(OrderStatus orderStatus);

    Optional<Order> findByDeliveryDate(LocalDate deliveryDate);

    Optional<Order> findByReturnDate(LocalDate returnDate);
}
}
