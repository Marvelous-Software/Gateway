import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ReactiveFormsModule } from '@angular/forms'; //Added to use reactive forms

import { IonicModule } from '@ionic/angular';

import { TestFormPageRoutingModule } from './test-form-routing.module';

import { TestFormPage } from './test-form.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule, //Added to use reactive forms
    IonicModule,
    TestFormPageRoutingModule
  ],
  declarations: [TestFormPage]
})
export class TestFormPageModule {}
