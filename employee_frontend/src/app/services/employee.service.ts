import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private api = "http://localhost:8080/api/v1/employees";

  constructor(private HttpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
    return this.HttpClient.get<Employee[]>(`${this.api}`);
  }
  createEmployee(employee: Employee): Observable<Object> {
    return this.HttpClient.post(`${this.api}`, employee);
  }
}
