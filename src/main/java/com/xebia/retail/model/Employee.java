package com.xebia.retail.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "emp")
@Entity
@Data
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4815167701510754127L;

	@Id
	private Integer id;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "created_at")
	private Timestamp createAt;

}
