package com.runner.entity;



import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.res.entity.WhatReservation;
import com.res.entity.WhatResource;
import com.res.entity.WhatUser;


public class RunResource extends getMacAdress {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(WhatResource.class)
				.addAnnotatedClass(WhatReservation.class)
				.addAnnotatedClass(WhatUser.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try{


			WhatResource table = new WhatResource("HC20");
			session.beginTransaction();
			session.save(table);


			session.getTransaction().commit();

			//extract primary key 
			int pk = table.getResourceId();
			
//add info to new table, second transaction 
			LocalDate ld = LocalDate.now();
			WhatReservation table_when = new WhatReservation(pk, ld, 12);
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.save(table_when);
			session.getTransaction().commit();
			
			//thrid transaction 
			int pk2 = table_when.getReservationId();
			WhatUser who = new WhatUser("Scott", "Davey", obtain(), "scott.davey@soprasteria.com", "07701017434", pk2 );
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.save(who);
			session.getTransaction().commit();



			System.out.println("Done: ");


		}
		finally{
			factory.close();
		}


	}
}

	


