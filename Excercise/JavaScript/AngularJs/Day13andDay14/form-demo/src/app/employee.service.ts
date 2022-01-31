import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  baseUrl = `http://localhost:9090`;

  constructor(private _client: HttpClient) { }

  fetchEmployees(): Observable<any>{
    let url = `${this.baseUrl}/employeeAll`;

    return this._client.get(url);
  }
  store(employeeData: any): Observable<any>{
   
    let name = employeeData.name;
    let sal = employeeData.salary;
    console.log('inside Store'+name+"sal:"+sal);
    let url = `${this.baseUrl}/employee/${name}/${sal}`; 
   return this._client.post(url,employeeData);
  }

  fetchEmployeeId(empId: number): Observable<any>{
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._client.get(url);
   }

   
  fetchEmployeeByName(empName: string): Observable<any>{
    console.log(`fetchByName=${empName}`)
    let url = `${this.baseUrl}/employeeByName/${empName}`;
    return this._client.get(url);
   }
}
