package com.captano.app.Employee_Management.repository;

import com.captano.app.Employee_Management.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Long> {
}
