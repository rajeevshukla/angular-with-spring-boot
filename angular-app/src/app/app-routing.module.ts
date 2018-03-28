import { HomeComponent } from './home/home.component';
import { UpdateProfileComponent } from './update-profile/update-profile.component';
import { SignupComponent } from './auth/signup/signup.component';
import { SigninComponent } from './auth/signin/signin.component';
import { NgModule } from '@angular/core';
import {RouterModule, Route} from '@angular/router';

const appRoute: Route[] = [
 {path: 'signin', component: SigninComponent},
 {path: 'signup', component: SignupComponent},
 {path: 'home', component: HomeComponent},
 {path: 'home/:username/edit', component: UpdateProfileComponent},

];

@NgModule({

    imports : [
      RouterModule.forRoot(appRoute)
    ],
    exports : [
      RouterModule
    ]

})
export class AppRoutingModule {

}
