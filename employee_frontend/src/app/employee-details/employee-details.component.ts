import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  user_id!: number;
  employee!: Employee;
  constructor(private api: EmployeeService, private route: ActivatedRoute) { }

  ngOnInit(): void {

    this.user_id = this.route.snapshot.params['user_id'];

    this.employee = new Employee();
    this.api.getEmployeeByUserId(this.user_id).subscribe(data => {
      this.employee = data;
    });
  }

}
