/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Customer;
import pojo.MiHibernateUtil;

/**
 *
 * @author formacion
 */
public class CustomerDao {
    private Session session;
    
    public CustomerDao(){
        SessionFactory sessionfactory=  MiHibernateUtil.getSessionFactory();
        this.session=sessionfactory.openSession();//session factory es mejor tenerla en un controlador de sesiones
        
    }
    
    public  List<Customer> findAll(){
        Transaction transaction=this.session.beginTransaction();
        try{
        Query query=this.session.createQuery("from Customer");
        List list = query.list();
        transaction.commit();
        
        return list;
        }catch(Exception e){
            transaction.rollback();
            throw e;
        }        
    }
    
    public Customer findByID(String id){
        return null;
    }
    
}
