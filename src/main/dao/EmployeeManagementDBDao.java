package main.dao;

import java.util.List;

import main.exceptions.DepartmentCreationException;
import main.exceptions.EmployeeCreationException;
import main.models.Department;
import main.models.Employee;

public class EmployeeManagementDBDao implements EmployeeManagementDao {

    @Override
    public List<Department> getAllDepartments() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Department getDepartment(int departmentId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setEmployeeDepartment(int employeeId, int departmentId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDepartments() throws DepartmentCreationException {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteEmployee(int employeeId) {
        // TODO Auto-generated method stub

    }

    @Override
    public Employee updateEmployeeName(int employeeId, String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee updateEmployeeDepartment(int employeeId, int departmentId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee addNewEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setDepartmentEmployee(Employee employee, int departmentId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEmployees() throws EmployeeCreationException {
        // TODO Auto-generated method stub

    }

    @Override
    public void readDataFromTxtFile()
            throws NumberFormatException, DepartmentCreationException, EmployeeCreationException {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeDataToTxtFile() {
        // TODO Auto-generated method stub

    }

    @Override
    public void seedData() throws EmployeeCreationException, DepartmentCreationException {
        // TODO Auto-generated method stub

    }
    
}
