package Sample.EmployeeManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Sample.EmployeeManagement.Bean.Employee;
import Sample.EmployeeManagement.Bean.EmployeeException;
@Repository
public class JdbcEmpRepo implements EmployeeRepository{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	

    public int save(Employee emp) {
        return jdbcTemplate.update(
                "insert into employee (name, id) values(?,?)",              
                emp.getEmpName(),emp.getEmpId());
    }

    // user defined exception
    public int update(Employee emp) throws EmployeeException {
    	if(emp.getSalary()>0) {
        return jdbcTemplate.update(
                "update employee set salary = ? where id = ?",
                emp.getSalary(), emp.getEmpId());
    	}
    	else {
    		throw new EmployeeException(1001,"Salary should not be negztive");
    	}
    }
    
  // lamda expression - java 1.8 
    public List<Employee> findAll() {
        return jdbcTemplate.query(
                "select * from employee",
                (rs, rowNum) ->
                        new Employee(
                                rs.getInt("empid"),
                                rs.getString("empname"),
                                rs.getString("address"),
                                rs.getString("dob"),
                                rs.getString("doj"),
                                rs.getString("department"),
                                rs.getInt("salary")
                        )
        );
    }
}
