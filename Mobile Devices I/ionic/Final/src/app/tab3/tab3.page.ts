import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-tab3',
  templateUrl: 'tab3.page.html',
  styleUrls: ['tab3.page.scss']
})
export class Tab3Page {

  page3: FormGroup

  constructor(private fb: FormBuilder) { 

    // create the form and store it as an object
    this.page3 = this.fb.group ({
      name: ["", Validators.compose([Validators.required, Validators.minLength(3), Validators.maxLength(20)])] , 
      email: ["", Validators.compose([Validators.required, Validators.email])] , 
      cbblue: [true, Validators.pattern('true')] , 
    })
  }

  submitForm() {

    console.log(this.page3.value)

  }  
}
