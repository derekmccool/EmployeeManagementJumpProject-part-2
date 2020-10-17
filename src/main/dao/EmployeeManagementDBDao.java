package main.dao;

import java.util.List;

import main.models.Employee;

public interface EmployeeManagementDBDao {
    
    List<Employee> getAllEmployees();
	Employee getEmployee(int employeeId);
	void deleteEmployee(int employeeId);
	boolean updateEmployeeName(int employeeId, String name);
	boolean updateEmployeeDepartment(int employeeId, int departmentId);
	boolean addNewEmployee(Employee employee);
	void setDepartmentEmployee(Employee employee, int departmentId);
	void setEmployees();
	void readDataFromDB();
	void writeDataToDB();

}
