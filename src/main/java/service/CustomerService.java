package service;

import model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    void save (Customer customer);
    Customer getById(Long id);

    Optional<Customer> getByLastName(String lastName);
    Optional<Customer> getByEmail(String email);

    List<Customer> getAll();

    void update (Customer customer);

    void delete (Customer customer);

    Customer findByEmail(String  email);
    Customer findByFirstName(String firstName);
    Customer findByLastName (String lastName);
    Customer findByAddress(String city, String street);
    Customer findByPhoneNumber (String phoneNumber);
}
