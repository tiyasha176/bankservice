package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "customer details")
public class Customer{
	@NotBlank
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotBlank
	@Size(max = 25)
	private String name;
	@NotBlank
	private String Dob;
	@NotBlank
	private String city;
	@NotBlank
	@Size(max = 25)
	private String address;
	@NotBlank
	private String gender;
	@NotBlank
	private Deposit deposit;
	Account account;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Deposit getDeposit() {
		return deposit;
	}
	
	public void setDeposit(@Valid Deposit deposit) {
		this.deposit = deposit;

		
	}
	
	public Account getAccount() {
	
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
		
		
	}
	
		
	
	
}
