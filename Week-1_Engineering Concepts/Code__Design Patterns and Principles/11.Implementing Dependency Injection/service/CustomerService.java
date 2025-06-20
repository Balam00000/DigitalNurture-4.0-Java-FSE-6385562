package service;

import repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository cr;

    public CustomerService(CustomerRepository cr){
        this.cr=cr;
    }
    public void getcustomer(int id){
        String customer=cr.findCustomerById(id);
        System.out.println(customer);
    }

}
