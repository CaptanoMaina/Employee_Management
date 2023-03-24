import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  user_id!: number;
  employee: Employee = new Employee();

  constructor(private api: EmployeeService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.user_id = this.route.snapshot.params['user_id'];

    this.api.getEmployeeByUserId(this.user_id).subscribe(data => {
      this.employee = data;
    }, error => console.log(error));
  }

  onSubmit() { }

}
