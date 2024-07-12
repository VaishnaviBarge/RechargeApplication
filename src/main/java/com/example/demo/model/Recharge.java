package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class Recharge {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "first_name", nullable = false)
	    private String firstName;

	    @Column(name = "last_name", nullable = false)
	    private String lastName;

	    @Column(name = "email", nullable = false, unique = true)
	    private String email;

	    @Column(name = "phone_no", nullable = false)
	    private String phoneNo;

	    @Column(name = "acc_no", nullable = false)
	    private String accNo;

	    @Column(name = "balance", nullable = false)
	    private String balance;

	    @Column(name = "password", nullable = false)
	    private String password;

		
		public Recharge() {
			super();
		}


		public Recharge(Long id, String firstName, String lastName, String email, String phoneNo, String accNo,
				String balance, String password) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNo = phoneNo;
			this.accNo = accNo;
			this.balance = balance;
			this.password = password;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
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


		public String getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}


		public String getAccNo() {
			return accNo;
		}


		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}


		public String getBalance() {
			return balance;
		}


		public void setBalance(String balance) {
			this.balance = balance;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Recharge [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phoneNo=" + phoneNo + ", accNo=" + accNo + ", balance=" + balance + ", password=" + password
					+ "]";
		}
	    
	    
}
