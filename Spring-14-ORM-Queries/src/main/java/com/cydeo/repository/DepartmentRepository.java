package com.cydeo.repository;

import com.cydeo.entity.Department;
import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {


    // Display all Departments in the furniture department
    List<Department> findByDepartment(String department);

// display all departments in the Health division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    // display top 3 departments with division name includes "Hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContaining(String division);


}
