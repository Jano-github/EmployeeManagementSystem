package Sample.EmployeeManagement;

import java.util.List;

import Sample.EmployeeManagement.Bean.Employee;

// interface extending crud repository
public interface EmployeeRepository {

	int save(Employee emp);

    int update(Employee emp) throws EmployeeException;

    List<Employee> findAll();
}
