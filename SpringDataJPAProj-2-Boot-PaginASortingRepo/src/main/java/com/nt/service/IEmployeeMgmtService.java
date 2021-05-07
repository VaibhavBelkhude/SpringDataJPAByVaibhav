package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.nt.dto.EmployeeDTO;
import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	
public List<EmployeeDTO> getAllEmployeesBySorting(String property, boolean asc);
public List<EmployeeDTO> getAllEmployeesBySorting(boolean asc,String...properties );
public List<EmployeeDTO> getPageRecords(int pageNo, int pageSize);
public void getRecordsByPagination(int pageSize);

}
