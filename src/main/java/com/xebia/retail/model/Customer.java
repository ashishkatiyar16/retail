package com.xebia.retail.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author ashish 
 * 
 * Data model of customers
 *
 */
@Table(name = "customer")
@Entity
@Data
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1741794768291482039L;
	@Id
	private Integer id;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "created_at")
	private Timestamp createAt;
}
