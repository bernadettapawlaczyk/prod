package repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;

import java.util.Optional;

@DataJpaTest
public class OrderRepositoryTest {
    @Autowired
    private OrderRepopsitory orderRepository;

    private static Long expectedId;
    private static Order order;


    @BeforeEach
    public void init() {
        expectedId = 1L;
        order = new Order();
    }

    //1
    @Test
    public void finds_order_by_id(){

        Order order = new Order();
        order.setId(expectedId);

        Optional<Order> foundOrderOptional = orderRepository.findById(expectedId);
        Assertions.assertThat(foundOrderOptional.isEmpty()).isTrue();

        orderRepository.save(order);
        foundOrderOptional = orderRepository.findById(expectedId);

        Assertions.assertThat(foundOrderOptional.isPresent()).isTrue();
        Order foundOrder = foundOrderOptional.get();
        Assertions.assertThat(foundOrder.getId()).isEqualTo(order.getId());
    }
}
