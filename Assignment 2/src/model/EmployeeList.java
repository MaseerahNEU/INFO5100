/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author masee
 */
public class EmployeeList {
    
    private ArrayList<CreateEmployee> directory;
    
    public EmployeeList(){
        this.directory = new ArrayList<CreateEmployee>();
    }

    public ArrayList<CreateEmployee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<CreateEmployee> directory) {
        this.directory = directory;
    }
    
    public CreateEmployee addEmp(){
        
        CreateEmployee newEmp = new CreateEmployee();
        directory.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmployee(CreateEmployee emp) {
        this.directory.remove(emp);
    }
        
    
}
