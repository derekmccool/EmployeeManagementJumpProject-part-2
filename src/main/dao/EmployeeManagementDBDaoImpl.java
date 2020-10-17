package main.dao;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.models.Employee;


import main.connections.*;

public class EmployeeManagementDBDaoImpl implements EmployeeManagementDBDao {



    // private int id;
	// private int departmentId;
	// private Department department;
	// private String name;
	// private String title;
    // private int salary;
    
    private static Connection conn;

    @Override
    //Get request from DB
    public List<Employee> getAllEmployees() {
        List<Employee> empList = new ArrayList<>();

        try(
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employee");
            ResultSet rs = pstmt.executeQuery();) {

                while(rs.next()){
                    int id = rs.getInt("id");
                    int deptId = rs.getInt("department_id");
                    String name = rs.getString("emp_name");
                    String title = rs.getString("title");
                    int salary = rs.getInt("salary");
                    // Employee emp = new Employee();
                    // empList.add(emp);
                }

        }catch(SQLException e){
            e.getStackTrace();
        }



        return empList;

    }

    @Override
    public Employee getEmployee(int employeeId) {
        Employee emp = null;
        ResultSet rs = null;

        try(
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employee WHERE id = ?");
            ) {

                while(rs.next()){
                    int deptId = rs.getInt("departmentId");
                    String name = rs.getString("name");
                    String title = rs.getString("title");
                    int salary = rs.getInt("salary");
                    // Employee emp = new Employee();
                 
                }

        }catch(SQLException e){
            e.getStackTrace();
        }finally{
            try{
                rs.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
           
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int employeeId) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean updateEmployeeName(int employeeId, String name) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateEmployeeDepartment(int employeeId, int departmentId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setDepartmentEmployee(Employee employee, int departmentId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEmployees() {
        // TODO Auto-generated method stub

    }

    @Override
    public void readDataFromDB() {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeDataToDB() {
        // TODO Auto-generated method stub

    }
    
}
