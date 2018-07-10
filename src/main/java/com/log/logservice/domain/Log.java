package com.log.logservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author  liuhuan
 * log对象
 */
@Data
@Entity
@Table(name="log")
public class Log implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	@Column(name = "description")
	private String description;

	@Column(name = "maintype")
	private int maintype;

	@Column(name = "tables")
	private String tables;

	@Column(name = "type")
	private String type;

	@Column(name = "username")
	private String username;

	@Column(name = "casetime")
	private Date casetime;

	/**
	 * 构造函数
	 * @param description 描述
	 * @param maintype
	 * @param tables
	 * @param type
	 * @param username
	 * @param casetime
	 */
	public Log(String description,int maintype,String tables ,String type,String username,Date casetime){
		this.description=description;
		this.maintype=maintype;
		this.tables=tables;
		this.type=type;
		this.username=username;
		this.casetime=casetime;
	}
}
