import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserValidator } from './user.validator';


@Component({
  selector: 'app-test-form',
  templateUrl: './test-form.page.html',
  styleUrls: ['./test-form.page.scss'],
})
export class TestFormPage implements OnInit {

  message = "In this page we are going to try to implement a form"
  copy = "Copyright 1887"
  week = `      <ion-row>
  <ion-col>
    <ion-label (click)="showDate(11)">11</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(12)">12</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(13)">13</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(14)">14</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(15)">15</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(16)">16</ion-label>
  </ion-col>
  <ion-col>
    <ion-label (click)="showDate(17)">17</ion-label>
  </ion-col>
</ion-row>`
week2 = "      <ion-row><ion-col>  <ion-label (click)='showDate(11)'>11</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(12)'>12</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(13)'>13</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(14)'>14</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(15)'>15</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(16)'>16</ion-label></ion-col><ion-col>  <ion-label (click)='showDate(17)>17</ion-label></ion-col></ion-row>"

  testform: FormGroup

  
  constructor(private fb: FormBuilder, private route: Router) { 

    // create the form and store it as an object
    this.testform = this.fb.group ({
      name: ["", Validators.compose([Validators.required, Validators.minLength(3), Validators.maxLength(20)])] , 
      phone: ["", Validators.compose([Validators.required, UserValidator.validatePhone])] , 
      email: ["", Validators.compose([Validators.required, Validators.email])] , 
      password: ["", Validators.compose([Validators.required, UserValidator.validatePassword])] , 
      cbprimary: [true, Validators.pattern('true')] , 
      cbsecondary: [false] , 
    })
  }


  // create a method to process the data entered by the user
  submitForm() {

    console.log(this.testform.value)

  }
  
  ngOnInit() {
  }

  showDate(date) {

    switch (date) {
      case 1:
        console.log("Sunday")
        break;
      case 2:
        console.log("Monday")
        break;
      case 3:
        console.log("Tuesday")
        break;
      case 4:
        console.log("Wednesday")
        break;
      case 5:
        console.log("Thursday")
        break;
      case 6:
        console.log("Friday")
        break;
      case 7:
        console.log("Saturday")
        break;
      default:        
      console.log("missed")
      break;
    }

  }

  showHome() {
    this.route.navigate(['/home']);
  }

}

