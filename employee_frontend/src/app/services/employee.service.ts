import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private api = "http://localhost:8080/api/v1/employees";

  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.api}`);
  }

  createEmployee(employee: Employee): Observable<Object> {
    return this.httpClient.post(`${this.api}`, employee);
  }

  getEmployeeByUserId(user_id: number): Observable<Employee> {
    return this.httpClient.get<Employee>(`${this.api}/${user_id}`);
  }

  updateEmployee(user_id: number, employee: Employee): Observable<Object> {
    return this.httpClient.put(`${this.api}/${user_id}`, employee);
  }
}