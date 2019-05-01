import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { RegisterService } from '../register.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  form= new FormGroup({
    firstName: new FormControl('',Validators.required),
    lastName: new FormControl('',Validators.required),
    gender: new FormControl('',Validators.required),
    dob: new FormControl('',Validators.required),
    department: new FormControl('',Validators.required)
  });

  regSubmit : Boolean;

  constructor(
    private registerService: RegisterService,
    private router : Router) { 
    regSubmit :false;   
  }

  ngOnInit() {
  }

  login(data){
    let employee = {emp: data}
    console.log(data);
    console.log(employee);
    this.registerService.createRegister(data).subscribe(response=> 
      {
       this.form.reset();
       this.regSubmit=true;
    },error => {
      console.log("error response");
    });
  }

}
