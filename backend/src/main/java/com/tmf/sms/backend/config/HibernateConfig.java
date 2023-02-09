package com.tmf.sms.backend.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		return sf;
	}
}
