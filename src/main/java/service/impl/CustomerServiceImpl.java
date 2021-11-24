package service.impl;

import model.Customer;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public abstract class CustomerServiceImpl extends CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.saveAndFlush(customer);
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Optional<Customer> getByLastName(String lastName){
        return customerRepository.findByLastName(lastName);
    }


    public Optional <Customer> getByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new LinkedList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.findById(customer.getId());
    }

    @Override
    public Customer findByEmail(String email) {
        return null;
    }

    @Override
    public Customer findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Customer findByLastName(String lastName) {
        return null;
    }

    @Override
    public Customer findByAddress(String city, String street) {
        return null;
    }

    @Override
    public Customer findByPhoneNumber(String phoneNumber) {
        return null;
    }
}
