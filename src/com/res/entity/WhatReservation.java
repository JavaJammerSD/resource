package com.res.entity;




import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




//Table about the reservation

@Entity
@Table(name = "what_reservation")
public class WhatReservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private int reservationId;
	
	@Column(name = "resource_id")
	private int resourceId;
	
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "time_slot")
	private int time;

	public WhatReservation(){

	}

	public WhatReservation(int resourceId, LocalDate date, int time){

		this.resourceId = resourceId;
		this.date = date;
		this.time = time;


	}



	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
//	public static void main(String[] args) {
//
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(WhatReservation.class)
//				.buildSessionFactory();
//		
//		Session session = factory.getCurrentSession();
//		
//		try{
//			
//			LocalDate ld = LocalDate.now();
////			Date d = new SimpleDateFormat("yyyy-MM-dd").parse(ld.toString());
//			
//			WhatReservation table = new WhatReservation(2, ld, 12);
//			session.beginTransaction();
//			
//			session.save(table);
//			session.getTransaction().commit();
//			System.out.println("Done: ");
//			
//		}
////		 catch (ParseException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		finally{
//			factory.close();
//		}
//		
//		
//	}
//		
		
	
	
	


}
