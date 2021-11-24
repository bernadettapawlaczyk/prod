package service;

import model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class CustomerService {

    public abstract void save(Customer customer);

    public abstract Customer getById(Long id);

    public abstract Optional<Customer> getByLastName(String lastName);
    abstract Optional<Customer> getByEmail(String email);

    public abstract List<Customer> getAll();

    public abstract void update(Customer customer);

    public abstract void delete(Customer customer);

    public abstract Customer findByEmail(String email);

    public abstract Customer findByFirstName(String firstName);

    public abstract Customer findByLastName(String lastName);

    public abstract Customer findByAddress(String city, String street);

    public abstract Customer findByPhoneNumber(String phoneNumber);
}
