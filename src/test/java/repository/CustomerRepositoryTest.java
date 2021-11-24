package repository;

import model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    // 1
    @Test
    public void finds_customer_by_last_name(){
        //given
        String lastName = "Pawlaczyk";

        Customer customer = new Customer();
        customer.setLastName(lastName);

        Optional<Customer> foundCustomerOptional = customerRepository.findByLastName(lastName);
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isTrue();

        //when
        customerRepository.save(customer);
        foundCustomerOptional = customerRepository.findByLastName(lastName);

        //then
        Assertions.assertThat(foundCustomerOptional.isPresent()).isTrue();
        Customer foundCustomer = foundCustomerOptional.get();
        Assertions.assertThat(foundCustomer.getLastName()).isEqualTo(customer.getLastName());

    }

    // 2
    @Test
    public void finds_customer_by_Email(){
        // given
        String email = "betaanna@gmail.com";

        Customer customer1 = new Customer();
        customer1.setEmail(email);

        // when
        Optional<Customer> foundCustomerOptional= customerRepository.findByEmail(email);
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isTrue();

        customerRepository.save(customer1);
        foundCustomerOptional = customerRepository.findByEmail(email);

        //then
        Assertions.assertThat(foundCustomerOptional.isPresent()).isTrue();
        Customer foundCustomer1 = foundCustomerOptional.get();
        Assertions.assertThat(foundCustomer1.getEmail()).isEqualTo(customer1.getEmail());
    }

    // 3
    @Test
    public void finds_customer_by_city(){
        //given
        String city = "Ełk";

        Customer customer2 = new Customer();
        customer2.setCity(city);

        Optional<Customer> foundCustomerOptional = customerRepository.findByCity(city);
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isTrue();

        // when
        customerRepository.save(customer2);
        foundCustomerOptional = customerRepository.findByCity(city);

        //then
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isFalse();
        Customer foundCustomer2 = foundCustomerOptional.get();
        Assertions.assertThat(foundCustomer2.getCity()).isEqualTo(customer2.getCity());
    }

    //4
    @Test
    public void finds_customer_by_street(){
        //given
        String street = "Ziolowa";

        Customer customer3 = new Customer();
        customer3.setStreet(street);

        Optional<Customer> foundCustomerOptional = customerRepository.findByStreet(street);
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isTrue();

        //when
        customerRepository.save(customer3);
        foundCustomerOptional = customerRepository.findByStreet(street);

        //then
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isFalse();
        Customer foundCustomer3 = foundCustomerOptional.get();
        Assertions.assertThat(foundCustomer3.getStreet()).isEqualTo(customer3.getStreet());
    }

    // 5
    @Test
    public void finds_customer_by_phoneNumber(){
        //given
        String phoneNumber = "500000000";

        Customer customer4 = new Customer();
        customer4.setPhoneNumber(phoneNumber);

        Optional<Customer> foundCustomerOptional = customerRepository.findByPhoneNumber(phoneNumber);
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isTrue();

        //when
        customerRepository.save(customer4);
        foundCustomerOptional = customerRepository.findByPhoneNumber(phoneNumber);

        //then
        Assertions.assertThat(foundCustomerOptional.isEmpty()).isFalse();
        Customer foundCustomer4 = foundCustomerOptional.get();
        Assertions.assertThat(foundCustomer4.getPhoneNumber()).isEqualTo(customer4.getPhoneNumber());
    }
}
