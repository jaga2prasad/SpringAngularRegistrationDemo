import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

  private url="http://127.0.0.1:8080/employeeList";

  getEmployee(){
    return this.http.get(this.url);
  }

}
