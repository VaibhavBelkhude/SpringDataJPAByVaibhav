package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj1CrudeRepositoryApplication {

	public static void main(String[] args) {
		//get  IOC container
				ApplicationContext ctx=SpringApplication.run(SpringDataJpaProj1CrudeRepositoryApplication.class, args);
				//get Service class obj
				IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
				//invoke method
				    EmployeeDTO dto=new EmployeeDTO("Vaibhav2","Nagpur","vaibhav555@gmail.com",7507514349l,67890.0f);
		
				   System.out.println("Employee registered with Id::"+service.registerEmployee(dto));
	                   System.out.println(service);
				    service.getEmployeesByIds(List.of(25,26,24)).forEach(System.out::println);
				    
				 //   System.out.println("Employee Remove with Id::"+service.removeEmployeeById(3));
				    System.out.println("getAllEmployees with Id::"+service. getAllEmployees());
				    //close container
				    ((ConfigurableApplicationContext) ctx).close();
	}
}
