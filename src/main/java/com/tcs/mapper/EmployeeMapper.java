/**
 * 
 */
package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Employee;

/**
 * @author springuser01
 * The role of RowMapper class is responsible to iterate the collection or result set of Employee Data
 */
public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setName(rs.getString("name"));
		employee.setAge(rs.getInt("age"));
		return employee;

	}

}
