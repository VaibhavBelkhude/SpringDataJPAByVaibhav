package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE2")
@Data
public class Employee  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ENO")
	private  Integer eno;
	
	@Column(name="ENAME",length=15)
	private  String ename;
	
	@Column(name="EADD",length=20)
	private  String eadd;
	
	@Column(name="ESALARY")
	private  Float eSalary;
	
	
	
}
