import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Employee[] = [];

  constructor(private api: EmployeeService, private router: Router) { }

  ngOnInit(): void {

    this.getEmployees();
  }
  private getEmployees() {
    this.api.getEmployeesList().subscribe((data) => {
      this.employees = data;
    });
  }

  updateEmployee(user_id: number) {
    this.router.navigate(['update-employee', user_id]);
  }

}
