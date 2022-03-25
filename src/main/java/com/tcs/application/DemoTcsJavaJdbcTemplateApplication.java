package com.tcs.application;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tcs.dao.EmployeeDAOImpl;
import com.tcs.model.Employee;

@SpringBootApplication
@ComponentScan({ "com.tcs.*" })
@EnableAutoConfiguration

public class DemoTcsJavaJdbcTemplateApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoTcsJavaJdbcTemplateApplication.class, args);
		EmployeeDAOImpl employeeJDBCTemplate = context.getBean(EmployeeDAOImpl.class);

		// method call here
		runEmployeeCRUD(employeeJDBCTemplate);

	}

	public static void runEmployeeCRUD(EmployeeDAOImpl employeeJDBCTemplate) {

		// create the employee data

//		employeeJDBCTemplate.setupDB();

		System.out.println("------Records Creation--------");
		employeeJDBCTemplate.create("siddu", 11);
		employeeJDBCTemplate.create("bano", 2);
		employeeJDBCTemplate.create("gridhar", 15);

		System.out.println("------Listing Multiple Records--------");
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		for (Employee record : employees) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}

		/*
		 * System.out.println("----Updating Record with ID = 2 -----");
		 * employeeJDBCTemplate.update(2, 20);
		 */
		System.out.println("----Listing Record with ID = 2 -----");
		Employee employee = employeeJDBCTemplate.getEmployee(2);
		System.out.print("ID : " + employee.getId());
		System.out.print(", Name : " + employee.getName());
		System.out.println(", Age : " + employee.getAge());

	}
}
