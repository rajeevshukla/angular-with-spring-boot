
import { AppConstants } from './../common/app.constants';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Injectable()
export class AuthService {

  authToken: string;
  constructor(private http: HttpClient, private router: Router ) {
  }


  login(username: string , password: string) {
    const loginInfo  = {
      username: username,
      password: password
    };
    console.log(loginInfo);
      this.http.post(AppConstants.baseUrl + '/login',
      loginInfo).subscribe(data => {
       console.log(data);
       localStorage.setItem('authStatus', data['status']);
       if (data['status']) {
         this.router.navigate(['/home']);
       } else {
         alert(data);
       }

      },

       error => console.log(error));
  }

  logout() {
      localStorage.removeItem('authStatus');
      this.router.navigate(['/signin']);
  }

  isAuthenticated() {
    return localStorage.getItem('authStatus') != null;
  }

}
