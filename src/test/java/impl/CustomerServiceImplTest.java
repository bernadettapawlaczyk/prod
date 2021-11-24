package impl;

import model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.CustomerRepository;
import service.CustomerService;

import java.util.Optional;

@SpringBootTest
public class CustomerServiceImplTest {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void add_new_user(){

        //given
        Customer customer = new Customer();
        customer.setLastName("Bla");
        customer.setEmail("gdgdg@gmil.com");

        // when
        customerService.save(customer);
        Optional<Customer> addNewCustomerByLastNameOptional = customerService.getByLastName(customer.getLastName());
        Optional <Customer> addNewCustomerByEmailOptional = customerService.getByEmail(customer.getEmail());

        //than
        Assertions.assertThat(addNewCustomerByLastNameOptional.isPresent()).isTrue();
        Customer addNewCustomerByLastName = addNewCustomerByLastNameOptional.get();
        Assertions.assertThat(addNewCustomerByLastName.getLastName()).isEqualTo(customer.getLastName());

        Assertions.assertThat(addNewCustomerByEmailOptional.isPresent()).isTrue();
        Customer addNewCustomerByEmail = addNewCustomerByEmailOptional.get();
        Assertions.assertThat(addNewCustomerByEmail.getEmail()).isEqualTo(customer.getEmail());

    }
}
