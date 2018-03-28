import { AuthService } from './auth.service';
import { Injectable } from '@angular/core';
import { CanDeactivate,
   ActivatedRouteSnapshot,
   RouterStateSnapshot,
   CanActivate} from '@angular/router';

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(private authService: AuthService) {

  }

  canActivate(activeRoute: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {

    return false;
  }
}
