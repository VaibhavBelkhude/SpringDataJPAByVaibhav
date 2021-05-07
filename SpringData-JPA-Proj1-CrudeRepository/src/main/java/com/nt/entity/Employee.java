package com.nt.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="EMPLOYEE")

public class Employee {  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPID")
	private Integer EmpId;
	@Column(name="ENAME")
	private String Ename;
	@Column(name="EADDS")
	private String Eadds;
	@Column(name="EMAIL")
	private String Email;
	@Column(name="PHONE")
	private Long Phone;
	@Column(name="ESAL")
	private Float Esal;
	

}
