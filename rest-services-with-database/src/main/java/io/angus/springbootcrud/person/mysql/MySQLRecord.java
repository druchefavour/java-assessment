package io.angus.springbootcrud.person.mysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MySQLRecord {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String firstname;
	private String lastname;
	private String address;
	private String phonenumber;
	
	public MySQLRecord() {
	
	}
	
	public MySQLRecord(Integer id, String name, String address, String phonenumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.firstname = lastname;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String name) {
		this.firstname = firstname;
	}
		
	public String getlastName() {
			return lastname;
		}
		public void setlasttName(String name) {
			this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}