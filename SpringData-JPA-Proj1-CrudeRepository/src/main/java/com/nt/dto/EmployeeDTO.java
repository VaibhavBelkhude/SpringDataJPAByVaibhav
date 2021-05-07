package com.nt.dto;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO  implements Serializable {

	public EmployeeDTO(String string, String string2, String string3, float f) {
		// TODO Auto-generated constructor stub
	}
	private Integer EmpId;
	@NonNull
	private String Ename;
	@NonNull
	private String Eadds;
	@NonNull
	private String Email;
	@NonNull
	private Long Phone;
	@NonNull
	private Float Esal;
	


	
	
}