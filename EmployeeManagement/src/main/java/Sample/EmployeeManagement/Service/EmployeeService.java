package Sample.EmployeeManagement.Service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import Sample.EmployeeManagement.EmployeeRepository;
import Sample.EmployeeManagement.Bean.Employee;

@Service
@Configuration
public class EmployeeService {
	
	private static Logger logger    = LoggerFactory.getLogger(EmployeeService.class);
    String fileName = "employee.txt";

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
//Serialization
	 public String addEmpDetails(Employee emp) throws IOException {
		
		FileOutputStream file = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(file);
	
		out.writeObject(emp.toString()); //
		out.close();
		file.close();
	
		logger.info(emp.toString()+ " Added Successfully");
	
		return emp.toString() + "Added Successfully";
		
	}

//adding new employee record
	public String addNewEmpDetails(Employee emp) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
		out.write(emp.toString());
		out.close();
		return emp.toString() + "Added New employee Successfully";
	}


	public void updateEmployee(Employee emp, int id) {
		if(id == emp.getEmpId()) {
			employeeRepository.save(emp);
			logger.info("employee salary updated in the table");
		}
		
	}


	public List<Employee> getAllEmployees() {
		logger.info("employee details");
			List<Employee> emp = (List<Employee>)employeeRepository.findAll(); 
			return emp;
		}
	

}
