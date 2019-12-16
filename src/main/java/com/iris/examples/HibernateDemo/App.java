package com.iris.examples.HibernateDemo;

import com.iris.dao.Userdao;
import com.iris.daoImpl.UserdaoImpl;
import com.iris.models.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       User obj=new User();
  
       obj.setUsername("Etesh");
       obj.setPassword("sinha");
       obj.setEmailaddress("eteshsinha@gmail.com");
       obj.setCity("G.noida");
      
       Userdao dao=new UserdaoImpl();
       dao.saveuser(obj);
       
    }
}
