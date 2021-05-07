package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringDataJpaProj2BootPaginASortingRepoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataJpaProj2BootPaginASortingRepoApplication.class, args);
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		//invoke methods
		service.getAllEmployeesBySorting("eno", false).forEach(System.out::println);
		  service.getAllEmployeesBySorting(true,"ename","eadd","eSalary").forEach(System.out::println);
		  service.getPageRecords(0,3).forEach(System.out::println);
		service.getRecordsByPagination(3);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
