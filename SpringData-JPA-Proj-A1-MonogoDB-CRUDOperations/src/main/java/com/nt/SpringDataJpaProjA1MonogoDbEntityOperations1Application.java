package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;

@SpringBootApplication
public class SpringDataJpaProjA1MonogoDbEntityOperations1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataJpaProjA1MonogoDbEntityOperations1Application.class, args);
		//get Service obj
				ICustomerMgmtService service=ctx.getBean("custService",ICustomerMgmtService.class);
				System.out.println("-----------------for insert operation-----------------");
				//System.out.println(service.registerCustomer(new CustomerDTO(null,12453,"Rajesh",6789.77f,"Pune")));
					/*	CustomerDTO  dto1=new CustomerDTO();
						dto1.setCno(789); dto1.setCname("mahesh");
						System.out.println(service.registerCustomer(dto1));
					*/	
				System.out.println(service.registerCustomer(new CustomerDTO(null, 9010,"suresh",6781.77f,"delhi")));
				
				/*System.out.println(service.registerCustomer(new CustomerDTO("ABC123",9011,"anil",678.77f,"delhi")));
				System.out.println(service.registerCustomer(new CustomerDTO("ABC124",9012,"ramesh",9781.77f,"hyd")));*/
				//System.out.println(service.registerCustomer(new CustomerDTO(IDGenerator.generateId(),9012,"ramesh",9781.77f,"hyd")));
				//System.out.println(service.registerCustomer(new CustomerDTO(IDGenerator.generateId(),9066,"jani",8781.77f,"vizag")));
				/*System.out.println("........update opeartion...................................");
				CustomerDTO  dto2=new CustomerDTO();
				dto2.setId("6008dda266bac307b378bbaa");
				dto2.setCno(9010); dto2.setCname("suresh"); dto2.setBillAmt(90000.0f); dto2.setCadd("hyd1");
				System.out.println(service.updateCustomer(dto2));*/
				
				
				//close container
				((ConfigurableApplicationContext) ctx).close();
	}

}
