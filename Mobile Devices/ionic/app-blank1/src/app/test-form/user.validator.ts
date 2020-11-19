import { FormControl } from '@angular/forms';


export class UserValidator {

  static validatePhone(fc: FormControl ) {

    if (fc.value.toLowerCase() === 'fred' || fc.value.toLowerCase() === 'joe' ) {
      return ({ validatePhone: true })
    } else {
      return (null)
    }

  }

  static validatePassword(fc: FormControl ) {

    if (fc.value.toLowerCase() === 'password' ) {
      return ({ validatePassword: true })
    } else {
      return (null)
    }

  }

}