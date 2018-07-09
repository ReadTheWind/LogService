package com.log.logservice.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author  lh
 */
@Data
public class Log implements Serializable{
	String desc;
	int maintype;
	String tables;
	String type;
	String username;
	long casetime;

	/**
	 * 构造函数
	 * @param desc 描述
	 * @param maintype
	 * @param tables
	 * @param type
	 * @param username
	 * @param casetime
	 */
	public Log(String desc,int maintype,String tables ,String type,String username,Long casetime){
		this.desc=desc;
		this.maintype=maintype;
		this.tables=tables;
		this.type=type;
		this.username=username;
		this.casetime=casetime;
	}
}
