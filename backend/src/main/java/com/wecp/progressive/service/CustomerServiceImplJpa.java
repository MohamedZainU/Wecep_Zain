package com.wecp.progressive.service;
 
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;
 
@Service
public class CustomerServiceImplJpa implements CustomerService{
 
 
    @Autowired
    private CustomerRepository customerRepository;
 
    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerRepository.findAll();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }
 
    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return customerRepository.findById(customerId).get();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }
 
    @Override
    public int addCustomer(Customers customers) throws SQLException {
         customerRepository.save(customers);
         return customers.getCustomerId();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }
 
    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // Customers customer2 = new Customers();
        // customer2.setName(customers.getName());
        // customer2.setEmail(customers.getEmail());
        // customer2.setUsername(customers.getUsername());
        // customer2.setPassword(customers.getPassword());
        // customer2.setAccounts(acc);
 
        customerRepository.save(customers);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }
 
    @Override
    public void deleteCustomer(int customerId) throws SQLException {
         customerRepository.deleteById(customerId);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }
 
    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        return customerRepository.getAllCustomersSortedByName();
 
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
    }
 
    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // return customerRepository.findAll();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
    }
 
    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
    }
 
    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
    }
 
    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }
 
   
 
   
   
}