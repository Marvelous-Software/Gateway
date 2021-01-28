import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ReactiveFormsModule } from '@angular/forms'; //Added to use reactive forms

import { IonicModule } from '@ionic/angular';

import { FormInClassPageRoutingModule } from './form-in-class-routing.module';

import { FormInClassPage } from './form-in-class.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule, //Added to use reactive forms
    IonicModule,
    FormInClassPageRoutingModule
  ],
  declarations: [FormInClassPage]
})
export class FormInClassPageModule {}
