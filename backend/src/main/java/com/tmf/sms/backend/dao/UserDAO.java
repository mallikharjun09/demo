package com.tmf.sms.backend.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tmf.sms.backend.config.HibernateConfig;
import com.tmf.sms.backend.models.User;

public class UserDAO {
	HibernateConfig config = new HibernateConfig();
    SessionFactory sf = config.getSessionFactory();
    
    
    public String insertUser(User user){
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        return "Users data inserted successfully";
    }
    
    public ArrayList<User> availabeUsers(){
        Session session = sf.openSession();
    	ArrayList<User> users = (ArrayList<User>) session.createQuery("from User").list();
        session.close();
        return users;
    }
    
    public void getUserDetails(User user) {
    	System.out.println(user.getUserId()+"\t"+user.getUserName()+"\t"+user.getAge()+"\t"+user.getPhoneNumber());
    }
    
}
