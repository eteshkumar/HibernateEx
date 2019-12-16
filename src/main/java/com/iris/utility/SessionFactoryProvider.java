package com.iris.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	private static SessionFactory sf;
	
	static {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.config.xml");
	 sf=cfg.buildSessionFactory();
	
	}
	public static SessionFactory getSessionFactory() {
		return sf;
	}

}
