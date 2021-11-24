package controller;

import lombok.extern.slf4j.Slf4j;
import model.Customer;
import model.CustomerType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;

@Controller
@Slf4j
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/customers"})
    public String getCustomers(Model model){
        model.addAttribute("customers", customerService.getAll());
        return "customers/index";
    }

    @RequestMapping(value = "/customer/delete")
    public String deleteCustomer(@RequestParam Customer id, Model model){
        customerService.delete(id);
        return "redirect:/customers";
    }

    @GetMapping({"/addNewCustomer"})
    public String newCustomer(Model model) {
        model.addAttribute("userTypes", new LinkedList<CustomerType>(Arrays.asList(CustomerType.values())));
        model.addAttribute("user", new Customer());

        return "customers/add";
    }

    @PostMapping("/save-customer")
    public String saveOrUpdate(@ModelAttribute Customer customer){
        customerService.save(customer);

        return "redirect:/customers";
    }
}
