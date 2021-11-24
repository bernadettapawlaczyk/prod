package repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByLastName(String lastName);

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByCity(String city);

    Optional<Customer> findByStreet(String street);

    Optional<Customer> findByPhoneNumber(String phoneNumber);
}
