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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3, max = 40, message = "Expense name needs to be between 3 and 40 charaters")
	@NotEmpty(message = "Please provide an expense name")
	private String expenseName;

	@Size(min = 3, max = 40, message = "Vendor name needs to be between 3 and 40 charaters")
	@NotEmpty(message = "Please provide a vendor name")
	private String vendor;

	@Min(value = 0, message = "Amount should be greater than 0")
	@NotNull(message = "Please provide an amount")
	private Integer amount;

	@Size(min = 3, max = 255, message = "Description needs to be between 3 and 255 characters")
	@NotEmpty(message = "Please provide a description")
	private String description;

	@Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;

	public Expense() {

	}

	public Expense(String expenseName, String vendor, Integer amount, String description) {
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Expense(Long id, String expenseName, String vendor, Integer amount, String description) {
		this.id = id;
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
