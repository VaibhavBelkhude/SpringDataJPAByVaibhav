package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.dto.EmployeeDTO;
import com.sun.xml.bind.v2.model.core.ID;

public interface IEmployeeMgmtService {
	
	 public    int   registerEmployee(EmployeeDTO dto);

	  public Iterable getEmployeesByIds(List<Integer> of);

	  public  int[] registerEmployeesGroup(List<EmployeeDTO> listDTO);

	  public  long getEmployeesCount();

	              String removeEmployeeById(int id);

				Optional<EmployeeDTO> getEmployeeById(int id);

				String removeEmployeeById1(int id);

				Iterable<EmployeeDTO> getAllEmployees();

				String removeEmployeesByGivenEntities(List<EmployeeDTO> listDTOs);
				Iterable<EmployeeDTO> findAllById(Iterable<ID> ids);
}
