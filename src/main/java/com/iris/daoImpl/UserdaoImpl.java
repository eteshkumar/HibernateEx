package com.iris.daoImpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.dao.Userdao;
import com.iris.models.User;
import com.iris.utility.SessionFactoryProvider;

public class UserdaoImpl implements Userdao {
	
	SessionFactory sf=SessionFactoryProvider.getSessionFactory();

	public boolean saveuser(User obj) {
		try {
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(obj);
	tx.commit();
	session.close();
	return true;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	  return false;
	

}
	}


