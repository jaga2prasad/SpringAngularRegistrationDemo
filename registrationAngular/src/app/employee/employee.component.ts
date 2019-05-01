import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  emp: any=[];

  constructor(private employeService: EmployeeService) { 
      console.log("this is employee");
      employeService.getEmployee().subscribe(response=>{
        console.log(response);
          this.emp = response;
      },error=>{

      });
  }

  ngOnInit() {
  }

columns = ['firstName', 'lastName', 'gender', 'dob', 'department'];
headerColumns = ['Firstname', 'Lastname', 'Gender', 'Date of Birth', 'Department'];

}
