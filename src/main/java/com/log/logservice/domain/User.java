package com.log.logservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @Author liuhuan
 * 用户对象
 */
@Entity
@Data
@Table(name = "user")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	@Column(name = "active")
	private  int active;

	@Column(name = "createdAt")
	private Date createdAt;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "creatorOrgCode")
	private String creatorOrgCode;

	@Column(name = "deleted")
	private  Long deleted;

	@Column(name = "enabled")
	private  int enabled;

	@Column(name = "lastModifiedAt")
	private Date lastModifiedAt;

	@Column(name = "lastModifiedBy")
	private  String lastModifiedBy;

	@Column(name = "name")
	private  String name;

	@Column(name = "version")
	private int version;
}
