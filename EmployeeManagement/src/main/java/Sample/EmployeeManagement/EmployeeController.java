package Sample.EmployeeManagement;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Sample.EmployeeManagement.Bean.Employee;
import Sample.EmployeeManagement.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static Logger logger    = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	//Serialization concept using text file
	@RequestMapping(path = "addEmployeeSerial", method = RequestMethod.POST) 
	public String addEmployee(@RequestBody Employee emp) throws IOException {
		logger.info(emp.getEmpName());
		return employeeService.addEmpDetails(emp);
	}
	
	@RequestMapping(path = "addNewEmployee", method = RequestMethod.POST) 
	public String addNewEmployee(@RequestBody Employee emp) throws IOException {
		return employeeService.addNewEmpDetails(emp);
	}
	
	//Update Salary using JDBC Template
	@RequestMapping(path = "updateSalary", method = RequestMethod.PUT)
	public String updateSalary(@RequestBody Employee e, @PathVariable int id) {
		employeeService.updateEmployee(e, id);
		return "Updated successfully";
	}
	
	@RequestMapping(path = "getEmployeeByDept")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(path = "/test", method = RequestMethod.GET) 
	public String test() {
		logger.info("inside Controller");
		return "I'm Alive";
	}
	
	
}
