package com.jessicapetrey.save_travels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "save-travels")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3, max = 255, message = "Expense name needs to be more than 3 charaters")
	@NotEmpty(message = "Please provide an expense name")
	private String expense;

	@Size(min = 3, max = 40, message = "Vendor name needs to be more than 3 charaters")
	@NotEmpty(message = "Please provide an vendor name")
	private String vendor;

	@Min(value = 0, message = "Amount should be greater than 0")
	@NotEmpty(message = "Please provide an amount")
	private Integer amount;

	@Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;

	public Expense() {

	}

	public Expense(String expense, String vendor, Integer amount) {
		this.expense = expense;
		this.vendor = vendor;
		this.amount = amount;
	}

	public Expense(Long id, String expense, String vendor, Integer amount) {
		this.id = id;
		this.expense = expense;
		this.vendor = vendor;
		this.amount = amount;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	protected void onCreate() {
		System.out.println("testing");
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
