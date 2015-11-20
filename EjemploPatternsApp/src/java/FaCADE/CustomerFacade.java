/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FaCADE;

import Dao.CustomerDao;
import java.util.List;
import pojo.Customer;

/**
 *
 * @author formacion
 */
public class CustomerFacade {
    private CustomerDao customerDao;
    
    public CustomerFacade(){
        this.customerDao= new CustomerDao();
    }
    
    public List<Customer> getListaCliente(){
       return customerDao.findAll();
    }
}
