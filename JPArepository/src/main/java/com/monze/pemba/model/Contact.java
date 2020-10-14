package com.monze.pemba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

// HIBERNATE STAFFS!
@Entity
@Table(name = "CONTACTSLIST")

public class Contact {
	private Long id;
	private String name;
	private String mobile;
	private String office;
	private float stars;

	@DateTimeFormat(pattern = "yyyy/mm/dd")
	@Column(name = "created_at", columnDefinition = "CURRENT_TIMESTAMP")
	private Date created_at;

	public Contact() {
		// protected Contact() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public float getStars() {
		return stars;
	}

	public void setStars(float stars) {
		this.stars = stars;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = new Date();// created_at;
	}

	public Date getCreated_at() {
		return new Date();
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", mobile=" + mobile + ", office=" + office + ", stars=" + stars
				+ ", created_at=" + created_at + "]";
	}
}
