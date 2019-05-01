import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http:HttpClient) { }

  private url="http://127.0.0.1:8080/register";

   createRegister(register) {
     return this.http.post(this.url, register);
   }

   getRegister(){
     return this.http.get(this.url);
   }
}
