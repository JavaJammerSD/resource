package com.res.entity;

import com.runner.entity.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




//table about the user
@Entity
@Table(name = "what_user")
public class WhatUser extends getMacAdress {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

		@Column(name = "MAC")
		private String mac;  //need to find pout hpw im going to bring the mac id in 


	@Column(name = "email")
	private String email;


	@Column(name = "phone")
	private String phone;

	@Column(name = "reservation_id")
	private int reservationId;
	
	public WhatUser(){
		
	}
	public WhatUser(String firstName, String lastName, String mac, String email, String phone, int reservationId){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.reservationId = reservationId;
//		mac = obtain();
		this.mac = mac;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public static String getMac() {
		return obtain();
	}
	public void setMac(String mac) {
		mac = obtain();
	}
	
//	public String getMac() {
//		return mac;
//	}
//	public void setMac(String mac) {
//		this.mac = mac;
//	}
//	
	
//	public static void main(String[] args) {
//
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(WhatUser.class)
//				.buildSessionFactory();
//		
//		Session session = factory.getCurrentSession();
//		
//		try{
//			
//			
//			WhatUser table = new WhatUser("Scott", "Davey", obtain(), "scott.davey@soprasteria.com", "07701017434", 1 );
//			session.beginTransaction();
//			
//			session.save(table);
//			session.getTransaction().commit();
//			System.out.println("Done: ");
//			
//			
//		}
//		finally{
//			factory.close();
//		}
//		
//		
//	}

	

}
