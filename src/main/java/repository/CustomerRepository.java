package repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public abstract class CustomerRepository implements JpaRepository<Customer, Long> {
    public abstract Optional<Customer> findByLastName(String lastName);

    public abstract Optional<Customer> findByEmail(String email);

    abstract Optional<Customer> findByCity(String city);

    abstract Optional<Customer> findByStreet(String street);

    abstract Optional<Customer> findByPhoneNumber(String phoneNumber);
}
